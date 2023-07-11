SUMMARY = "Haskell Cabal-syntax library documentation"
DESCRIPTION = "This package provides the Haskell Cabal-syntax library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-syntax-doc-3.8.1.0-3.2.noarch.rpm"
RPM_HASH = "f2e13cb087eeeed6376c3ae33a30cc5231a75a8a114d372b7778b2026bcfbaab1ea88cec446c0c7f8fddc76f2e6a37f81a2468cc1535d0770e9c55674025ee17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Cabal-syntax-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
