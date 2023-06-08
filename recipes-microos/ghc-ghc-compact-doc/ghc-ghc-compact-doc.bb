SUMMARY = "Haskell ghc-compact library documentation"
DESCRIPTION = "This package provides the Haskell ghc-compact library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-doc-0.1.0.0-1.1.noarch.rpm"
RPM_HASH = "bd579e74c9c53a4a9c6bfb0d166384e5a18415617b3ab95c71a33406b7e5c0409f7fa30450d4c4a170fc5a87872073528ac4cd8c1ecd9719b8298e3b98ceb29b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-compact-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
