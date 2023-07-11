SUMMARY = "Haskell Cabal-syntax profiling library"
DESCRIPTION = "This package provides the Haskell Cabal-syntax profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-syntax-prof-3.8.1.0-3.2.aarch64.rpm"
RPM_HASH = "d6bbd89effb1449621bf995aaf077a80b163c0d60dde8f5b65590f4703583b401bc8ceaabfe28d1a5f15c5c99ed7782231c52ebd51ed98197766becf213b574f"

RPROVIDES:${PN} += "ghc-Cabal-syntax-prof \
ghc-prof-Cabal-syntax-3.8.1.0"

RDEPENDS:${PN} += "ghc-Cabal-syntax-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
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
