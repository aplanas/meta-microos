SUMMARY = "Haskell template-haskell library"
DESCRIPTION = "This package provides the Haskell template-haskell library."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-2.19.0.0-3.1.aarch64.rpm"
RPM_HASH = "aabe0fd394175a810ee3b9b731d141d9558f5f3abd01fc8159744e383843820b636425d2540c212eb1b78608fdd275f66d6620e40adb77f184fac22d95ece907"

RPROVIDES:${PN} += "ghc-template-haskell \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
