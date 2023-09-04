SUMMARY = "Haskell cabal-install-solver profiling library"
DESCRIPTION = "This package provides the Haskell cabal-install-solver profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-solver-prof-3.8.1.0-1.8.aarch64.rpm"
RPM_HASH = "2c6d931f5d45a1d150d1a13a8ef7086dc80723cf69f630008cd64f3b10fb486f08363f82e41a170de525795ce39620fd18e189fea9a41bd99cc1c7c4e7c843ee"

RPROVIDES:${PN} += "ghc-cabal-install-solver-prof \
ghc-prof-cabal-install-solver-3.8.1.0-HqlMIPzmCO3CZ7Pg6YZtFo"

RDEPENDS:${PN} += "ghc-cabal-install-solver-devel \
ghc-prof-Cabal-3.8.1.0 \
ghc-prof-Cabal-syntax-3.8.1.0 \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-edit-distance-0.2.2.1-ITBK6JvlsOE36MkOzN30LX \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
