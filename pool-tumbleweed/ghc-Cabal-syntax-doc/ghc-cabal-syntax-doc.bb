SUMMARY = "Haskell Cabal-syntax library documentation"
DESCRIPTION = "This package provides the Haskell Cabal-syntax library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-syntax-doc-3.8.1.0-1.1.noarch.rpm"
RPM_HASH = "6f8bc034099affcc1213cd65b3d1ffe55c0857506c89bf9edd8ec1e9916dc4e27f310158a8b7d6a0e49da0e3f100ea439b112e9031b53110d7f3e3009dd8d296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Cabal-syntax-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
