SUMMARY = "Securely store session data in a client-side cookie"
DESCRIPTION = "Achieves security through AES-CTR encryption and Skein-MAC-512-256 \
authentication. Uses Base64 encoding to avoid any issues with characters."
LICENSE = "MIT"

PV = "0.9.1.2"

RPM_NAME = "ghc-clientsession-0.9.1.2-4.6.aarch64.rpm"
RPM_HASH = "0a993453b6162a38c1b180b3af43e02eb3a63cf26cdfda06896463258168daade86adb0007c7628acc03a2f8181f6347862a01ed0648c46d0d569683032706b8"

RPROVIDES:${PN} += "ghc-clientsession \
libHSclientsession-0.9.1.2-LlqL6bYAJ8NAeAYS4avg1k-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh-ghc9.4.5.so \
libHSbasement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn-ghc9.4.5.so \
libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so \
libHScipher-aes-0.2.11-AUtsAMArdsjvHtn454bNK-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScprng-aes-0.6.1-57mLrS8iLhhDpycOALP7vk-ghc9.4.5.so \
libHScrypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE-ghc9.4.5.so \
libHScrypto-cipher-types-0.0.9-9ncnLpjReeQDgkKFRi4kUz-ghc9.4.5.so \
libHScrypto-random-0.0.9-60vlsiR41hHGmZ9VjOCRvw-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSentropy-0.4.1.10-HkaMHQZP8nyRj15panvtP-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmemory-0.18.0-8CsggfkyXReDSMbRoae4Yp-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSsecuremem-0.1.10-14D6arGPELi9Mzd7V4Fyfu-ghc9.4.5.so \
libHSsetenv-0.1.1.3-5NpDWBw9aN36gdxnY8UI9x-ghc9.4.5.so \
libHSskein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
