SUMMARY = "Haskell filepattern library documentation"
DESCRIPTION = "This package provides the Haskell filepattern library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-doc-0.1.3-2.7.noarch.rpm"
RPM_HASH = "016afe51582699b990648e8b707cfc68bea3ae625a3b10f239906ef8645551fd2ec4bd64b93ce3055b525162c9e455f7ebfaf7b04df46477020eeade2e96e698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepattern-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
