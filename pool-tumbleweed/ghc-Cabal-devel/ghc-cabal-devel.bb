SUMMARY = "Haskell Cabal library development files"
DESCRIPTION = "This package provides the Haskell Cabal library development files."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-devel-3.8.1.0-3.2.aarch64.rpm"
RPM_HASH = "753277f59e85424abbf3aae41d5f79f3d4b68862452e57e84a6b39c3c0334690ee4fe88b2eba2c3413a26952404f3f45c9e181e2c9142d40c9374b19b638364b"

RPROVIDES:${PN} += "ghc-Cabal-devel \
ghc-Cabal-static \
ghc-devel-Cabal-3.8.1.0"

RDEPENDS:${PN} += "ghc-Cabal \
ghc-compiler \
ghc-devel-Cabal-syntax-3.8.1.0 \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-process-1.6.16.0 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3"

inherit rpm
