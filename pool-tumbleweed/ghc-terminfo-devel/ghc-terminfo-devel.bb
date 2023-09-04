SUMMARY = "Haskell terminfo library development files"
DESCRIPTION = "This package provides the Haskell terminfo library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-devel-0.4.1.5-1.1.aarch64.rpm"
RPM_HASH = "c2eeb259007bd83c24d338725a0d72853d81087a92ce58a780737cf59ca461bf268e627287131a8d3beffc166f167d97e9c748f61e745967eb26a32f4e47f5be"

RPROVIDES:${PN} += "ghc-devel-terminfo-0.4.1.5 \
ghc-terminfo-devel \
ghc-terminfo-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-terminfo \
ncurses-devel"

inherit rpm
