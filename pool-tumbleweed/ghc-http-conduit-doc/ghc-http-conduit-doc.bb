SUMMARY = "Haskell http-conduit library documentation"
DESCRIPTION = "This package provides the Haskell http-conduit library documentation."
LICENSE = "BSD-2-Clause"

PV = "2.3.8.2"

RPM_NAME = "ghc-http-conduit-doc-2.3.8.2-1.2.noarch.rpm"
RPM_HASH = "9d554ed4dfecbffa3cde83816e0680fa27dbd7eb95813bdf1316874ce110332267d4e926056652fa1c858b38920c4894b17eb3f69a3979352343a62d7c114b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
