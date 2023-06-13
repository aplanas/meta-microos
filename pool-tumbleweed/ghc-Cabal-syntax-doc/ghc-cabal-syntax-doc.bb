SUMMARY = "Haskell Cabal-syntax library documentation"
DESCRIPTION = "This package provides the Haskell Cabal-syntax library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-syntax-doc-3.8.1.0-3.1.noarch.rpm"
RPM_HASH = "7e1646094477aeb1e9d65b91c753eada029e4acdec4fcd94dc00255f159727c9771172101898a9637ba22a8542dee5e3036c96a8fc0f5957c385fd018e598898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Cabal-syntax-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
