import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse().toString());
        }
        // while(sc.hasNext()) {
        //     String str = sc.nextLine();
        //     StringBuilder sb = new StringBuilder(str);
        //     String result = "";
        //     for(int i = sb.length() - 1; i >= 0; i--) {
        //         result += sb.charAt(i);
        //     }
        //     System.out.print(result);
        // }
    }
}