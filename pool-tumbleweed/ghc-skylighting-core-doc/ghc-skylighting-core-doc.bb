SUMMARY = "Haskell skylighting-core library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-core-doc-0.13.4.1-1.1.noarch.rpm"
RPM_HASH = "e45a3393111dbc53a36a9cda5311d023dabbcd53952b03e5cd65078c0dc2875570306da1ba7e26d6e2e80d4d14ec627c98c750b4bb971d39e0b7c37e24078cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
