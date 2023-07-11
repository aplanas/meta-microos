SUMMARY = "Haskell wizards profiling library"
DESCRIPTION = "This package provides the Haskell wizards profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-prof-1.0.3-6.3.aarch64.rpm"
RPM_HASH = "17814bedfc9765bd027205e6a627b11acd5918be18f28e8b75285f969364b0fbe193dc69ddb89d8ca743f1261511df865c9420148480bf2308f6f6b0817d85cc"

RPROVIDES:${PN} += "ghc-prof-wizards-1.0.3-1eOj2T9eMm8Jj6cnosVGZb \
ghc-wizards-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-control-monad-free-0.6.2-AMlHq80A2qJLNQ8iIcl5z7 \
ghc-prof-haskeline-0.8.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-wizards-devel"

inherit rpm
