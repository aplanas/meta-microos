SUMMARY = "Haskell Cabal profiling library"
DESCRIPTION = "This package provides the Haskell Cabal profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-prof-3.8.1.0-1.1.aarch64.rpm"
RPM_HASH = "bbd9fe001f3261d57d28e0a70ae10ae4a81d42f341e05bcc70f3019a1f98b7680d8d0a58c44cd09e6d7e064a43a84bdc6fc108e3449af2099959a3279f4a8552"

RPROVIDES:${PN} += "ghc-Cabal-prof \
ghc-prof-Cabal-3.8.1.0"

RDEPENDS:${PN} += "ghc-Cabal-devel \
ghc-prof-Cabal-syntax-3.8.1.0 \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-process-1.6.17.0 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3"

inherit rpm
