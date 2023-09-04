SUMMARY = "Haskell xmonad library documentation"
DESCRIPTION = "This package provides the Haskell xmonad library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.17.2"

RPM_NAME = "ghc-xmonad-doc-0.17.2-1.8.noarch.rpm"
RPM_HASH = "690ada80e8797a63a5707e0df46117b69f4fce80281c5e012892697837026b63edbb25539cea2353302f79ee8f4b6fe944c05fcb8586f429e1cc0a910dde24da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xmonad-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
