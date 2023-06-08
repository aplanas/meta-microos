SUMMARY = "Haskell colour library documentation"
DESCRIPTION = "This package provides the Haskell colour library documentation."
LICENSE = "MIT"

PV = "2.3.6"

RPM_NAME = "ghc-colour-doc-2.3.6-2.3.noarch.rpm"
RPM_HASH = "7d4120336da70bcf5b01fd240f9b13a260f4858fb68272b34381631b411fff143459e6946823270217f4b4ef8754ee989c2ca477056ccc5cec2939607bf5b3a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-colour-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
