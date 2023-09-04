SUMMARY = "Haskell Cabal-syntax library development files"
DESCRIPTION = "This package provides the Haskell Cabal-syntax library development files."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-syntax-devel-3.8.1.0-1.1.aarch64.rpm"
RPM_HASH = "1a04e343e1b5e1eef36e354ccd62f404d057151ec9af4276dd45ae108836975c8a0f81f4872d8be054ad569caf1033bacfc9bfbd39dd0a08e09a63d02a5520e2"

RPROVIDES:${PN} += "ghc-Cabal-syntax-devel \
ghc-Cabal-syntax-static \
ghc-devel-Cabal-syntax-3.8.1.0"

RDEPENDS:${PN} += "ghc-Cabal-syntax \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3"

inherit rpm
