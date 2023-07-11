SUMMARY = "Haskell Cabal profiling library"
DESCRIPTION = "This package provides the Haskell Cabal profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-prof-3.8.1.0-3.2.aarch64.rpm"
RPM_HASH = "21fa7a50234c4ddb6d25474f5dfb6b467bbe797c18f06f77503bc7a8b1edad892e7eddf74ee9c3537b5eeb8675fc00606fe74f5faf6bfd0272a849b7c51c2e61"

RPROVIDES:${PN} += "ghc-Cabal-prof \
ghc-prof-Cabal-3.8.1.0"

RDEPENDS:${PN} += "ghc-Cabal-devel \
ghc-prof-Cabal-syntax-3.8.1.0 \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-process-1.6.16.0 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3"

inherit rpm
