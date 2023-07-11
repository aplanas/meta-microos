SUMMARY = "Haskell cereal library documentation"
DESCRIPTION = "This package provides the Haskell cereal library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-doc-0.5.8.3-2.6.noarch.rpm"
RPM_HASH = "ea4e13c4a49eb43b933174bc9f65a3808262d0c6c24ea7d09dc12f3ad374452752394f38ab1961e124d3ebc53e526f1038c101eea7cfc4d36809ffc63be2859f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cereal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
