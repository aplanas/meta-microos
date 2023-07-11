SUMMARY = "Haskell assoc profiling library"
DESCRIPTION = "This package provides the Haskell assoc profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-assoc-prof-1.1-1.3.aarch64.rpm"
RPM_HASH = "93d12cd43dfdce60a4502b35a213a092464cf58946922cf7d1ab188639c619c09ded2f73490340d07e27bc1650a945a9203893e2c9b3336fe6d13aba4f4e3841"

RPROVIDES:${PN} += "ghc-assoc-prof \
ghc-prof-assoc-1.1-H3gdf0Ue1d5sn9822dJ4G"

RDEPENDS:${PN} += "ghc-assoc-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa"

inherit rpm
