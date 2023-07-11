SUMMARY = "Haskell yesod-static library documentation"
DESCRIPTION = "This package provides the Haskell yesod-static library documentation."
LICENSE = "MIT"

PV = "1.6.1.0"

RPM_NAME = "ghc-yesod-static-doc-1.6.1.0-4.7.noarch.rpm"
RPM_HASH = "481ced1504edaa2d2c3128e7975bc2118dbfa902bcca28e9152ebf3e9acc2cde97542617c1b0eef48a653ecc99c23c955801674c34eeffd5d6a1447577b680d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-static-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
