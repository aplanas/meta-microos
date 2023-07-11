SUMMARY = "Haskell skylighting-format-ansi library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-doc-0.1-2.4.noarch.rpm"
RPM_HASH = "bd777d6dbdd6e763f15b37f3735de940a9a1b9ba23baa33b8b7d1d6bfcd17f3d2dc3ea4ef5528836a9fb0c4857449c756b991971bba9ab1d940fe23240ad262e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-ansi-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
