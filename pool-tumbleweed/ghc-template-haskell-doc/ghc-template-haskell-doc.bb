SUMMARY = "Haskell template-haskell library documentation"
DESCRIPTION = "This package provides the Haskell template-haskell library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-doc-2.19.0.0-1.1.noarch.rpm"
RPM_HASH = "24812dd3f9b9f3fbc2a0ee06b2cd38917e039e022a7eb54ff55d94ea1458965ccd06add537c4311d20bd17db7b9601013ec1a1e966bd850d0dcd3b057e839401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-template-haskell-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
