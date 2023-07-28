SUMMARY = "Haskell cabal-plan library documentation"
DESCRIPTION = "This package provides the Haskell cabal-plan library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3.0"

RPM_NAME = "ghc-cabal-plan-doc-0.7.3.0-2.1.noarch.rpm"
RPM_HASH = "d7f5e2f57038ab3d737cfc4bc84a21125f87936fe17837e33ed4446fb3d319746917ca977be8afb32afd2e14f5baa3a5e9059cb0f1d2040ef0038686ab32b615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-plan-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
