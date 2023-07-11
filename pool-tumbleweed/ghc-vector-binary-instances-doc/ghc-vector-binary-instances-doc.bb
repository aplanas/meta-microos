SUMMARY = "Haskell vector-binary-instances library documentation"
DESCRIPTION = "This package provides the Haskell vector-binary-instances library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.5.2"

RPM_NAME = "ghc-vector-binary-instances-doc-0.2.5.2-6.1.noarch.rpm"
RPM_HASH = "d35872b37ba7319dee143d91d0b928537cb2d6543a68ec1a768e49e9878dcd8b931928b1eea71d4a1da4c06bef27d69c9b1104df76c649ed5d519d82d52de002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-binary-instances-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
