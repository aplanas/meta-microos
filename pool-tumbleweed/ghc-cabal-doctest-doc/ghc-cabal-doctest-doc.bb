SUMMARY = "Haskell cabal-doctest library documentation"
DESCRIPTION = "This package provides the Haskell cabal-doctest library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "ghc-cabal-doctest-doc-1.0.9-4.3.noarch.rpm"
RPM_HASH = "70eb6363708360fbc04ce4f0880d76386f47a104accd7ffb1706bbfec1a447e10955240263006dd63a4520c33ff39a911a1660f515016326716b628416495a1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-doctest-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
