SUMMARY = "Haskell Cabal library development files"
DESCRIPTION = "This package provides the Haskell Cabal library development files."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-devel-3.8.1.0-1.1.aarch64.rpm"
RPM_HASH = "aa77b8ef76e6506af0b7d9196aaf8485c3ae1c4eb9438d4a32cff9e5cc85099b78b2fc556cd1aa0057bca105cf27ada0929c17fd985a8bc2225ee35f67886179"

RPROVIDES:${PN} += "ghc-Cabal-devel \
ghc-Cabal-static \
ghc-devel-Cabal-3.8.1.0"

RDEPENDS:${PN} += "ghc-Cabal \
ghc-compiler \
ghc-devel-Cabal-syntax-3.8.1.0 \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-process-1.6.17.0 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3"

inherit rpm
