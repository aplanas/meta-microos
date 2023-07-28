SUMMARY = "Haskell http-conduit library documentation"
DESCRIPTION = "This package provides the Haskell http-conduit library documentation."
LICENSE = "BSD-2-Clause"

PV = "2.3.8.2"

RPM_NAME = "ghc-http-conduit-doc-2.3.8.2-2.1.noarch.rpm"
RPM_HASH = "00dafe0f233465500bd96d3330cc42312b287b35d69ff132560b278d738f9de3339041e86e50f4f13f4e7fdd655651e8fea2e86f132bd515ee95a3f9518c3b7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
