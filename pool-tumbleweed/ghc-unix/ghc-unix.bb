SUMMARY = "Haskell unix library"
DESCRIPTION = "This package provides the Haskell unix library."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-2.7.3-3.1.aarch64.rpm"
RPM_HASH = "04d462005587cb549e55b8b50da64e1c2463cf11e44f6b0c27e3f65d97373dd09b218bd74d04bbf425a8d575492afcfe46549a9e467bbfc4f5bdd188c44f6e92"

RPROVIDES:${PN} += "ghc-unix \
ghc-unix(aarch-64) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
