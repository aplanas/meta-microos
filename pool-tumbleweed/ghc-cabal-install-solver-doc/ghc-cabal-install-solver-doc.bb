SUMMARY = "Haskell cabal-install-solver library documentation"
DESCRIPTION = "This package provides the Haskell cabal-install-solver library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-solver-doc-3.8.1.0-1.6.noarch.rpm"
RPM_HASH = "c05bff15195606ca74a9a8f4711196141dc9f192ac0e7712763793f2452221c6e7774217d9de826171dbe5425615f8fd0d6799b9c1d1cb3896673fa03e393ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-install-solver-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
