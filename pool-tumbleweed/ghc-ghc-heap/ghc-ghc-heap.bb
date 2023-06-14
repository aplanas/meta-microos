SUMMARY = "Haskell ghc-heap library"
DESCRIPTION = "This package provides the Haskell ghc-heap library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-heap-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "36385ce9e2023a35c9611fda5983a67f69f7d91bdd0a59225b66bff3a686c73c79a8e18089f20dd04234fad718623a2c305f6e4257fbbc617bf5c656510df007"

RPROVIDES:${PN} += "ghc-ghc-heap \
libHSghc-heap-9.4.5-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
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
