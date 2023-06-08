SUMMARY = "Haskell Cabal library documentation"
DESCRIPTION = "This package provides the Haskell Cabal library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-doc-3.8.1.0-1.1.noarch.rpm"
RPM_HASH = "d7d5bd1f25a067621975bdbebbddb92913cb38afdb9f9d9523af70c567ff8b9ee65b9bb5317a537d000018ec36cd8bfef850dbb2b906ed56313a2c4a865ed2d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Cabal-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
