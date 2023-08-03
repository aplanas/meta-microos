SUMMARY = "Securely store session data in a client-side cookie"
DESCRIPTION = "Achieves security through AES-CTR encryption and Skein-MAC-512-256 \
authentication. Uses Base64 encoding to avoid any issues with characters."
LICENSE = "MIT"

PV = "0.9.2.0"

RPM_NAME = "ghc-clientsession-0.9.2.0-2.1.aarch64.rpm"
RPM_HASH = "fbe26f8bf7535608d1a2ae5f36ffa87e16ccbf4800d5a2449813dc13a33ab95274d57ff9127663fa4a88c5b312d48e81844f03aab6ead7d58d9913ca1fec25ad"

RPROVIDES:${PN} += "ghc-clientsession \
libHSclientsession-0.9.2.0-4cx1ifSXftyKQDB0RGxUDf-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh-ghc9.4.5.so \
libHSbasement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScrypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE-ghc9.4.5.so \
libHScryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSentropy-0.4.1.10-HkaMHQZP8nyRj15panvtP-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSinteger-gmp-1.1-ghc9.4.5.so \
libHSmemory-0.18.0-8CsggfkyXReDSMbRoae4Yp-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSsetenv-0.1.1.3-5NpDWBw9aN36gdxnY8UI9x-ghc9.4.5.so \
libHSskein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
