SUMMARY = "Haskell Cabal-syntax profiling library"
DESCRIPTION = "This package provides the Haskell Cabal-syntax profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-syntax-prof-3.8.1.0-1.1.aarch64.rpm"
RPM_HASH = "b6e666e956ff0791f222d4db241bd2e7a9f8ec7a8f7e4d5e1d0d1aa6e7fa814a10aac92af1bc4894c7aa065c010c81b1656fb1665c5893247fa6f2132ca201da"

RPROVIDES:${PN} += "ghc-Cabal-syntax-prof \
ghc-prof-Cabal-syntax-3.8.1.0"

RDEPENDS:${PN} += "ghc-Cabal-syntax-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3"

inherit rpm
