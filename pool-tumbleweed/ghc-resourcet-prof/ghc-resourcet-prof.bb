SUMMARY = "Haskell resourcet profiling library"
DESCRIPTION = "This package provides the Haskell resourcet profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "ghc-resourcet-prof-1.2.6-2.3.aarch64.rpm"
RPM_HASH = "629763b2eca5cceb2147b3d57de5b11290e0c711e25fa4ea7a7b9418c320637528ef3b84e0ee6b428da2a4c35802426a2914655a0748c38c28a216d99c65ab1b"

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
