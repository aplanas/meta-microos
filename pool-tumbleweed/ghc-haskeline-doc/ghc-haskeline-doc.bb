SUMMARY = "Haskell haskeline library documentation"
DESCRIPTION = "This package provides the Haskell haskeline library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "ghc-haskeline-doc-0.8.2-1.1.noarch.rpm"
RPM_HASH = "74b437a6862b22475a8e95d05280b16a118c9da40d446da6c67ab34dfe0e93c8d285c15d30ce543887b090a5fc403f3d467f971afc3257a8a2bc8a89afc957af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haskeline-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
