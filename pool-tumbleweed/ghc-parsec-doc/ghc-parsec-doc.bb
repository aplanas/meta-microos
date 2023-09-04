SUMMARY = "Haskell parsec library documentation"
DESCRIPTION = "This package provides the Haskell parsec library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-doc-3.1.16.1-1.1.noarch.rpm"
RPM_HASH = "e4b5254f11ebffb32add661c7b42b6b9404c9742ffb643939d962d4efa166a09ea02ecd9dca467c37dabeeb66acb0805480aeb48dc32ba57d4d05a80d1dc8d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
