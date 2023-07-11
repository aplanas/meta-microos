SUMMARY = "Haskell colour library documentation"
DESCRIPTION = "This package provides the Haskell colour library documentation."
LICENSE = "MIT"

PV = "2.3.6"

RPM_NAME = "ghc-colour-doc-2.3.6-2.6.noarch.rpm"
RPM_HASH = "6d80aaa242fb5126a785815089864165cd7cbeb8ca56b2f4bf217ce6cd06e326bf6e13072e007ae0e64b169148afeaad50d2d61ba0ba18cc07ca014ff54ce7e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-colour-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
