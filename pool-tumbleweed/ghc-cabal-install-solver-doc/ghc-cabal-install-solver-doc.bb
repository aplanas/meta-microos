SUMMARY = "Haskell cabal-install-solver library documentation"
DESCRIPTION = "This package provides the Haskell cabal-install-solver library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-solver-doc-3.8.1.0-1.8.noarch.rpm"
RPM_HASH = "a2662164a6bbde1262f4f3bc2fb24820784505941bded5e6e5734aee3185e0db372e0a2d7d63ff0acf3c23d5c00a60ab494b9bf859894a3f59b8db35e1e81d00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-install-solver-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
