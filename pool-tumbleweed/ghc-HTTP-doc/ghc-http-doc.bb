SUMMARY = "Haskell HTTP library documentation"
DESCRIPTION = "This package provides the Haskell HTTP library documentation."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-doc-4000.4.1-1.9.noarch.rpm"
RPM_HASH = "3107dd80e18dca5e8165e0e87964742ed5e92bcecdab22d9f6e899b9c05984e0c129b3d56f4a5edfc19769a5aa13509784b571c3e7d8694e231541cdb48410c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-HTTP-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
