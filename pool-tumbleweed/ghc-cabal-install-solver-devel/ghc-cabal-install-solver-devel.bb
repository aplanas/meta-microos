SUMMARY = "Haskell cabal-install-solver library development files"
DESCRIPTION = "This package provides the Haskell cabal-install-solver library development \
files."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-solver-devel-3.8.1.0-1.8.aarch64.rpm"
RPM_HASH = "23a23ea9e1efec9244ecb917da25512d56b0ab64ff6f59ff549945c8e51a562acf8fcfe892c5f17d359e3f48d987efb1f41c0ef09430a615548d388aebf27a5e"

RPROVIDES:${PN} += "ghc-cabal-install-solver-devel \
ghc-devel-cabal-install-solver-3.8.1.0-HqlMIPzmCO3CZ7Pg6YZtFo"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal-install-solver \
ghc-compiler \
ghc-devel-Cabal-3.8.1.0 \
ghc-devel-Cabal-syntax-3.8.1.0 \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-edit-distance-0.2.2.1-ITBK6JvlsOE36MkOzN30LX \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
