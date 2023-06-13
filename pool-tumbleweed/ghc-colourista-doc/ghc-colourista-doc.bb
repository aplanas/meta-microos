SUMMARY = "Haskell colourista library documentation"
DESCRIPTION = "This package provides the Haskell colourista library documentation."
LICENSE = "MPL-2.0"

PV = "0.1.0.2"

RPM_NAME = "ghc-colourista-doc-0.1.0.2-1.3.noarch.rpm"
RPM_HASH = "613b84476e353342aafb7a43762e1b62ac24f65e51e44e40a004f7541b0ab5602c66d201e86f5da5a15e98efdbc115e1ef82f1845cfa41daa17c7391b35476d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-colourista-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
