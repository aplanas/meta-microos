SUMMARY = "Haskell xml-conduit library documentation"
DESCRIPTION = "This package provides the Haskell xml-conduit library documentation."
LICENSE = "MIT"

PV = "1.9.1.3"

RPM_NAME = "ghc-xml-conduit-doc-1.9.1.3-1.7.noarch.rpm"
RPM_HASH = "3d0527091a2e492c26313003b2236809cc2dfc50f27cb55ed67004edf1421af6b5a778a6b756321a63be3e81a52291da8ebfe9e25edd0f5d804500d8da800a6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
