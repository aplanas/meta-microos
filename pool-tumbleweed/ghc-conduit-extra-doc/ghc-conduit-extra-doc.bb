SUMMARY = "Haskell conduit-extra library documentation"
DESCRIPTION = "This package provides the Haskell conduit-extra library documentation."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "ghc-conduit-extra-doc-1.3.6-2.12.noarch.rpm"
RPM_HASH = "0fb1d1604f30f5198db152dadadfc9c1c3cc69251d8feb87835d7bafa67e85228db17d7a6528f5d836e19714c933fd701e5cb9797fbc1dcf36229fce39f839ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-conduit-extra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
