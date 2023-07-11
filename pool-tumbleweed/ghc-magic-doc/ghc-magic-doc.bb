SUMMARY = "Haskell magic library documentation"
DESCRIPTION = "This package provides the Haskell magic library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-magic-doc-1.1-4.6.noarch.rpm"
RPM_HASH = "56440b6c45e2cdf3ba7ce9c31e387f8c8b99470304bec544454ce6527aae067f0bb276733f7bfd60d33d3aed1c232cc4453a52641fab157d935760b0f6a53ff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-magic-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
