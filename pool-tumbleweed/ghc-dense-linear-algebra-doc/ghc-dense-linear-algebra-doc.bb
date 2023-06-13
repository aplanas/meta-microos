SUMMARY = "Haskell dense-linear-algebra library documentation"
DESCRIPTION = "This package provides the Haskell dense-linear-algebra library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-dense-linear-algebra-doc-0.1.0.0-3.3.noarch.rpm"
RPM_HASH = "b616c004a7e7c164439b39d1b7963bbfe4c4d6bdd79a8ca84d4eef91287a4b2480c76df825123cfe77a72d51a76ef38b71eafc0e6023e88132c525b253dea9c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dense-linear-algebra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
