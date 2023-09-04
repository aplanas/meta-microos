SUMMARY = "Securely store session data in a client-side cookie"
DESCRIPTION = "Achieves security through AES-CTR encryption and Skein-MAC-512-256 \
authentication. Uses Base64 encoding to avoid any issues with characters."
LICENSE = "MIT"

PV = "0.9.2.0"

RPM_NAME = "ghc-clientsession-0.9.2.0-2.4.aarch64.rpm"
RPM_HASH = "771cde0269bbb57f3df9a1b188206a8e5b345511409d4268dfe34221ee6571eba26acd82b823681e0f306b5ecd1b555b44b4bbe58021fd5a0ca8ef17f9ca9dde"

RPROVIDES:${PN} += "ghc-clientsession \
libHSclientsession-0.9.2.0-KWpEVRfIrcVFYLxAWzOYnt-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScrypto-api-0.13.3-2rX3thRbGDW3ZR7H62fg4Z-ghc9.4.6.so \
libHScryptonite-0.30-LSC76M64GQaFgLGwFfgIgW-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSentropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSinteger-gmp-1.1-ghc9.4.6.so \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSsetenv-0.1.1.3-5X2tG8kGRXiEiTQvekWgx7-ghc9.4.6.so \
libHSskein-1.0.9.4-HfR9tmKKFFp5G94XUHSnaw-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
