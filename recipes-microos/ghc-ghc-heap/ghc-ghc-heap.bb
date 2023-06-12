SUMMARY = "Haskell ghc-heap library"
DESCRIPTION = "This package provides the Haskell ghc-heap library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-heap-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "36385ce9e2023a35c9611fda5983a67f69f7d91bdd0a59225b66bff3a686c73c79a8e18089f20dd04234fad718623a2c305f6e4257fbbc617bf5c656510df007"

RPROVIDES:${PN} += "ghc-ghc-heap ghc-ghc-heap(aarch-64) libHSghc-heap-9.4.5-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
