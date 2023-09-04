SUMMARY = "Haskell vector-th-unbox profiling library"
DESCRIPTION = "This package provides the Haskell vector-th-unbox profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-vector-th-unbox-prof-0.2.2-4.3.aarch64.rpm"
RPM_HASH = "dac00b9adb2cce05669025e680334c1b1722dbad1e26629c5f111569042b0d47dbc4b532996845e90da101483ec8a2642fa4f6c971e3bcba0424555c44f756e2"

RPROVIDES:${PN} += "ghc-prof-vector-th-unbox-0.2.2-4Hl5syaTqnL4b2rNrCiqzQ \
ghc-vector-th-unbox-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-vector-th-unbox-devel"

inherit rpm
