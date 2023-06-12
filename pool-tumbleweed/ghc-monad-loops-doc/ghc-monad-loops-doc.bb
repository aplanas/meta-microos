SUMMARY = "Haskell monad-loops library documentation"
DESCRIPTION = "This package provides the Haskell monad-loops library documentation."
LICENSE = "SUSE-Public-Domain"

PV = "0.4.3"

RPM_NAME = "ghc-monad-loops-doc-0.4.3-11.2.noarch.rpm"
RPM_HASH = "08fbcb8d6a81690142b5ad85b1bd6437ebdb023480fe34d69b3026ce2217bd0aeceb8364880be120f0b6b0aaa3d438af22a843c2cd8839545588b7266b6e0390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monad-loops-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
