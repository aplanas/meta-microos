SUMMARY = "Haskell template-haskell library"
DESCRIPTION = "This package provides the Haskell template-haskell library."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-2.19.0.0-1.1.aarch64.rpm"
RPM_HASH = "3fc294b2d5b3d9716dd0aa901369cc2f3930b16c4484202e03e04f369376d6c87bea07579fc25a6646c4f18318718b38fdbbb6f36bbd09ad22980bd6141c3710"

RPROVIDES:${PN} += "ghc-template-haskell ghc-template-haskell(aarch-64) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
