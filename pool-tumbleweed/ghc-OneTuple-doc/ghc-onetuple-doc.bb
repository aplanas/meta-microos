SUMMARY = "Haskell OneTuple library documentation"
DESCRIPTION = "This package provides the Haskell OneTuple library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-OneTuple-doc-0.4.1.1-1.2.noarch.rpm"
RPM_HASH = "e3af7c592e33809579109f24083dae62a89fdaa62e759eb70040ebddb62ab463108390c6a98ff9d3c3db10a44e6db292c239be2c0e622b50b383b62ae89cf2a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-OneTuple-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
