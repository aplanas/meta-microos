SUMMARY = "Haskell Cabal-syntax library development files"
DESCRIPTION = "This package provides the Haskell Cabal-syntax library development files."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-syntax-devel-3.8.1.0-3.2.aarch64.rpm"
RPM_HASH = "15d988e1e5cddf2ed0e1325ee298e1963264d832365cef3f64368730d2fdaa89eff6e6f987c709c61aed7f195174a89b323d5caae8d913bb692c228ecd0b5948"

RPROVIDES:${PN} += "ghc-Cabal-syntax-devel \
ghc-Cabal-syntax-static \
ghc-devel-Cabal-syntax-3.8.1.0"

RDEPENDS:${PN} += "ghc-Cabal-syntax \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
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
