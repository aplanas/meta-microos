SUMMARY = "Haskell pretty library"
DESCRIPTION = "This package provides the Haskell pretty library."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-1.1.3.6-3.1.aarch64.rpm"
RPM_HASH = "644afa81c7589cde7e43d47d3eb3cbe6914e8773938458e5624fc5cf52f57d3404ac7cd799e9e8167fc38b7b6b6f53407700c8c02cd0253647b3edf3583414da"

RPROVIDES:${PN} += "ghc-pretty ghc-pretty(aarch-64) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
