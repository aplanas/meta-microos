SUMMARY = "Haskell dlist library documentation"
DESCRIPTION = "This package provides the Haskell dlist library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-doc-1.0-3.2.noarch.rpm"
RPM_HASH = "bb88d9228a2da53271c0d4698b8cba05b372d08213172bdd3bed0aebaa9b30855d537f1e3796ffc0a59a92de8f75fa5d7ee81556dc7ffe21b3a92c53ef77df32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dlist-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
