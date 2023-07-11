SUMMARY = "Haskell cabal-install-solver library development files"
DESCRIPTION = "This package provides the Haskell cabal-install-solver library development \
files."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-solver-devel-3.8.1.0-1.6.aarch64.rpm"
RPM_HASH = "c970e258c96b61a6ca792d7409c8548d73d4de511edf0d0979e15c788c2c945acb1de56b140bdf24c6d9ae08a408c4b219cc944c0b07b68a82e6b95c6a7b1d1d"

RPROVIDES:${PN} += "ghc-cabal-install-solver-devel \
ghc-devel-cabal-install-solver-3.8.1.0-IpM66GQ0mvV3BDvTXL2kvp"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal-install-solver \
ghc-compiler \
ghc-devel-Cabal-3.8.1.0 \
ghc-devel-Cabal-syntax-3.8.1.0 \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-edit-distance-0.2.2.1-6sqaVuKvJlk4f2SjC0p5nu \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
