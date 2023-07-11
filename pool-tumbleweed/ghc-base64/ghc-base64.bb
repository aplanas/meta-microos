SUMMARY = "A modern RFC 4648-compliant Base64 library"
DESCRIPTION = "RFC 4648-compliant Base64 with an eye towards performance and modernity \
(additional support for RFC 7049 standards)."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.4"

RPM_NAME = "ghc-base64-0.4.2.4-3.6.aarch64.rpm"
RPM_HASH = "6f9396ad7f036e48d5714808ebced312d2feedfb08bb0eff026f13ed2c13cd962ff5e36ba35f4d42629e0ae7fae16affe88c4f7e86e083ef9707ef08359f8e88"

RPROVIDES:${PN} += "ghc-base64 \
libHSbase64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStext-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
