SUMMARY = "Haskell conduit library documentation"
DESCRIPTION = "This package provides the Haskell conduit library documentation."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "ghc-conduit-doc-1.3.5-1.3.noarch.rpm"
RPM_HASH = "7cd90ce9e50c03b43182c09798032e823ffdf3a180a119b36707b40f4f6c7565b7158d5ada8b75e5ff2ddcc745f8981d7e942f21e40f5697f9dce119450ee4a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
