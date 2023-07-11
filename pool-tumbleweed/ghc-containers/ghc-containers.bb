SUMMARY = "Haskell containers library"
DESCRIPTION = "This package provides the Haskell containers library."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-0.6.7-3.2.aarch64.rpm"
RPM_HASH = "6105fc0b2ee4180e962dbdc8fb5a92fbd1fc49ab27d5c8467e8fadff1375dec03adf0faef4903b1b051b58c7ba6df377c06c50de4ea967b4e88e2c63f155c607"

RPROVIDES:${PN} += "ghc-containers \
libHScontainers-0.6.7-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
