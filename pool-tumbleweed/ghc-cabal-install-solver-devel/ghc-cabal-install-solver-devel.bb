SUMMARY = "Haskell cabal-install-solver library development files"
DESCRIPTION = "This package provides the Haskell cabal-install-solver library development \
files."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-solver-devel-3.8.1.0-1.3.aarch64.rpm"
RPM_HASH = "f0779ec3bb52643a8ac42d70d9546de16fad84a3daf2c61ecde7ee62800541b8c58db03240f7ebee2e405d24f642d9ee2fbab458d59d2bbc3120f1a01874ac0c"

RPROVIDES:${PN} += "ghc-cabal-install-solver-devel \
ghc-cabal-install-solver-devel(aarch-64) \
ghc-devel(cabal-install-solver-3.8.1.0-IpM66GQ0mvV3BDvTXL2kvp)"

RDEPENDS:${PN} += "/bin/sh \
ghc-cabal-install-solver \
ghc-compiler \
ghc-devel(Cabal-3.8.1.0) \
ghc-devel(Cabal-syntax-3.8.1.0) \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(edit-distance-0.2.2.1-6sqaVuKvJlk4f2SjC0p5nu) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(mtl-2.2.2) \
ghc-devel(pretty-1.1.3.6) \
ghc-devel(transformers-0.5.6.2)"

inherit rpm
