package programmers.hyunSu.Level2.sol11_20;

/**
 * 문제 설명
 * 효진이는 멀리 뛰기를 연습하고 있습니다. 효진이는 한번에 1칸, 또는 2칸을 뛸 수 있습니다. 칸이 총 4개 있을 때, 효진이는
 * (1칸, 1칸, 1칸, 1칸)
 * (1칸, 2칸, 1칸)
 * (1칸, 1칸, 2칸)
 * (2칸, 1칸, 1칸)
 * (2칸, 2칸)
 * 의 5가지 방법으로 맨 끝 칸에 도달할 수 있습니다. 멀리뛰기에 사용될 칸의 수 n이 주어질 때,
 * 효진이가 끝에 도달하는 방법이 몇 가지인지 알아내, 여기에 1234567를 나눈 나머지를 리턴하는 함수, solution을 완성하세요.
 * 예를 들어 4가 입력된다면, 5를 return하면 됩니다.
 *
 * 제한 사항
 * n은 1 이상, 2000 이하인 정수입니다.
 */
public class Solution16 {

    public long solution(int n) {
        long answer = 0;
        if(n==1)
            answer = 1;
        else if(n==2)
            answer = 2;
        else{
            long prev1 = 1;
            long prev2 = 2;
            int cnt = 3;
            while(cnt<=n){
                answer = prev1 % 1234567 + prev2 % 1234567;
                prev1=prev2 % 1234567;
                prev2= answer;
                cnt++;
            }
        }
        return answer % 1234567;
    }
}