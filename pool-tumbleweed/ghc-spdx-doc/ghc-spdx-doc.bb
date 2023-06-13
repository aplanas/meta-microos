SUMMARY = "Haskell spdx library documentation"
DESCRIPTION = "This package provides the Haskell spdx library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.3"

RPM_NAME = "ghc-spdx-doc-1.0.0.3-1.2.noarch.rpm"
RPM_HASH = "81b29b9bbc525b7b86d9bf84ffc7753ddc917215e520f0893b2aa4c5cc76a7818958d509649ce1c9b0ea907dcc387e99ee6c66d4c33295974e887cd41953824d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-spdx-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
