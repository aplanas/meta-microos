SUMMARY = "A simple XML library"
DESCRIPTION = "A simple XML library."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-1.3.14-13.6.aarch64.rpm"
RPM_HASH = "dcbfc429c7e158ef1238a3d5d25826c578684b382f66ce7dd045ddfd783bccfb3c192ace3f5ca04ffaf538b32aa511e71a32b4a0c20507a9813f5a29d5ac56cc"

RPROVIDES:${PN} += "ghc-xml \
libHSxml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
