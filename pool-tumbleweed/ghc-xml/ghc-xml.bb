SUMMARY = "A simple XML library"
DESCRIPTION = "A simple XML library."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-1.3.14-13.3.aarch64.rpm"
RPM_HASH = "6bf0ab877944e79cc9ad8e62b8b0a71bec3d747d71ff1c9cf7152e93138c7e08c9a557198d682e3fa1c5d9b6a825c1e122871049986b9ddc649bead90e30842e"

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
