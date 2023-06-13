SUMMARY = "Haskell csv library documentation"
DESCRIPTION = "This package provides the Haskell csv library documentation."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-csv-doc-0.1.2-4.2.noarch.rpm"
RPM_HASH = "fd2faa62b2d26311a38e228313d59d1871323d5fffc56d2492bf424192e15c41c024e051b143f5c04dfba970b9f196e1c0736ee5c7d8cf6c78848db085281279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-csv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
