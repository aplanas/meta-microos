SUMMARY = "Haskell cabal-doctest profiling library"
DESCRIPTION = "This package provides the Haskell cabal-doctest profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "ghc-cabal-doctest-prof-1.0.9-4.3.aarch64.rpm"
RPM_HASH = "2e2368a44ce1beb0b3c9834a75d47dd755fd74b7d5fe210956d825cb076b630e6d7a9678625d3e2d8bdcb950b54945b5349684cd4a9fab09c1490f7fb76acc68"

RPROVIDES:${PN} += "ghc-cabal-doctest-prof \
ghc-prof-cabal-doctest-1.0.9-4FGoSiQ39Py47R5SD4NHa8"

RDEPENDS:${PN} += "ghc-cabal-doctest-devel \
ghc-prof-Cabal-3.8.1.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2"

inherit rpm
