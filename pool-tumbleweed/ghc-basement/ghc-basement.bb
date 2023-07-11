SUMMARY = "Foundation scrap box of array & string"
DESCRIPTION = "Foundation most basic primitives without any dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-basement-0.0.16-1.3.aarch64.rpm"
RPM_HASH = "28aca0f3f5eea829fcfd6f6a306142eb82017214b29b12038d0766f24420dd42d942715ad0416bfae898fd64bfaecd28bee905f3fe6d4452fabd8ad3b28d25f2"

RPROVIDES:${PN} += "ghc-basement \
libHSbasement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
