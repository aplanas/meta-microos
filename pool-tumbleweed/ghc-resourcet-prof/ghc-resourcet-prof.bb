SUMMARY = "Haskell resourcet profiling library"
DESCRIPTION = "This package provides the Haskell resourcet profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "ghc-resourcet-prof-1.2.6-2.6.aarch64.rpm"
RPM_HASH = "d93812684651179251d96a68a424b5d6d7fda2fd1e00d4db65da6e135ce2f863db0862c1cc6a94ea2bfe10443ca751f50af86927fd37d3a5a8fa26753fbd503d"

RPROVIDES:${PN} += "ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-resourcet-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-mtl-2.2.2 \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-resourcet-devel"

inherit rpm
