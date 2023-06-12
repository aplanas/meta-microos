SUMMARY = "Haskell parsec library documentation"
DESCRIPTION = "This package provides the Haskell parsec library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-doc-3.1.16.1-3.1.noarch.rpm"
RPM_HASH = "8dde2af603e32c0ac38b97f0da522d8bc0a24467a6a1bef613f90f75c586bb75147436fa4b2e2997c187317c8bbd701150d095f92c4b199630d3d54d1972fb17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parsec-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
