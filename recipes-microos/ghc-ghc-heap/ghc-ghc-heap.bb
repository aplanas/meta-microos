SUMMARY = "Haskell ghc-heap library"
DESCRIPTION = "This package provides the Haskell ghc-heap library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-heap-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "81b289f4e636853b8060a6540b9f20837abf89d6002e2641473f9f9414915b3a0c9aa0cbee3bb262f841c8ec34b46bd3c83d13361c5d0a2378c1004e79e4d594"

RPROVIDES:${PN} += "ghc-ghc-heap ghc-ghc-heap(aarch-64) libHSghc-heap-9.4.5-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
