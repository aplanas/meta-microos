SUMMARY = "Haskell cabal-install-solver library documentation"
DESCRIPTION = "This package provides the Haskell cabal-install-solver library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-solver-doc-3.8.1.0-1.3.noarch.rpm"
RPM_HASH = "815fe25a0e73464dac23dd7983945f92dab91bcbebf138619b09d21afb72d6be6ae3263028684d2d86fbb602531b868cc560b7099a0fbebc8eede3e47dc7aaab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-install-solver-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
