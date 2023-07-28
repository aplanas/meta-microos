SUMMARY = "Haskell cassava library documentation"
DESCRIPTION = "This package provides the Haskell cassava library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.3.0"

RPM_NAME = "ghc-cassava-doc-0.5.3.0-3.1.noarch.rpm"
RPM_HASH = "8ac47715605d9165573648b32417591eda0a1f6020d91891836fa63a77e14b1eac31402f6b6b0ced581373b600bee52e58dc952edb5856100fec8bcb3f03d1bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cassava-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
