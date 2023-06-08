SUMMARY = "Haskell Cabal-syntax library documentation"
DESCRIPTION = "This package provides the Haskell Cabal-syntax library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-syntax-doc-3.8.1.0-1.1.noarch.rpm"
RPM_HASH = "497656dff6cc7bbc801ae560677a04798af22d3ddd018022aaf823f027ee8a585dc0f710f6c3fc0034c9134fe3157fefddb6cc1affd347ad155499084f1679a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Cabal-syntax-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
