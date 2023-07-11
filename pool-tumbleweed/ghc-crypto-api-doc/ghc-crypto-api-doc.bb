SUMMARY = "Haskell crypto-api library documentation"
DESCRIPTION = "This package provides the Haskell crypto-api library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-doc-0.13.3-5.6.noarch.rpm"
RPM_HASH = "5f2ce6493409ca971ac0f581f1af06fe710c34251f7079d62dd2a4440c2185734dbd926a12d32259348bd55fb034b1d0c7ce487d1698643705196d30d3b7d0f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypto-api-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
