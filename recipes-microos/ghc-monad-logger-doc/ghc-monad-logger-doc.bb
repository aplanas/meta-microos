SUMMARY = "Haskell monad-logger library documentation"
DESCRIPTION = "This package provides the Haskell monad-logger library documentation."
LICENSE = "MIT"

PV = "0.3.39"

RPM_NAME = "ghc-monad-logger-doc-0.3.39-2.4.noarch.rpm"
RPM_HASH = "94acbab2be2d0e28932563b1329d44c2abe87d1d0be06ab90c343aad257303d5c7fcab2041a9907ee3cda007dd808754077b5b63814a20492848ba8b728653f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monad-logger-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
