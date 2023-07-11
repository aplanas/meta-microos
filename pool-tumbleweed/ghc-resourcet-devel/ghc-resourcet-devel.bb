SUMMARY = "Haskell resourcet library development files"
DESCRIPTION = "This package provides the Haskell resourcet library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "ghc-resourcet-devel-1.2.6-2.6.aarch64.rpm"
RPM_HASH = "9bba619a9de980902fa1d8c2177b0f7a00a51e865602efdddbd906046d2af16246fd1f0535ad1cdb4f20ceacf1c78dbfe61e652eb345749a53b7317ef05b740e"

RPROVIDES:${PN} += "ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-resourcet-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-mtl-2.2.2 \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-resourcet"

inherit rpm
