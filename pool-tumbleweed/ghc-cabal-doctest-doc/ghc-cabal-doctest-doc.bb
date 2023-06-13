SUMMARY = "Haskell cabal-doctest library documentation"
DESCRIPTION = "This package provides the Haskell cabal-doctest library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "ghc-cabal-doctest-doc-1.0.9-4.2.noarch.rpm"
RPM_HASH = "9d40c0095ac230f53ab1c9de6f5ee8ef52c00810fcf99be2ece82e489ec54b94be71837467c3d5f19b9191cd30bb9c28ae58ab26e549e710a79e462c25208412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-doctest-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
