SUMMARY = "Haskell Cabal library documentation"
DESCRIPTION = "This package provides the Haskell Cabal library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-doc-3.8.1.0-3.2.noarch.rpm"
RPM_HASH = "fec237bffecb3ff106d0e2f5fdf06c6a0238069261e847ff9b133ca0ee5bb0f650ea2ccff3b61e7c75b9cf8e6d4532cf3dde0152f33a53ce3e0b84b6276e3cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Cabal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
