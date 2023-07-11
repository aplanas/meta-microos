SUMMARY = "Haskell mtl library documentation"
DESCRIPTION = "This package provides the Haskell mtl library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-doc-2.2.2-3.2.noarch.rpm"
RPM_HASH = "4fe0039adae777320ab7c51bee2d69db58d05cca7f9dc21c6a7a706c5dfc56032513ea6bee8f7b0fbaf87441c9c811c9ea4dc4954e7f1bb995a8fa4cb820c79f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mtl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
