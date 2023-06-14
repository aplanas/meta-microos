SUMMARY = "Haskell old-time profiling library"
DESCRIPTION = "This package provides the Haskell old-time profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.3"

RPM_NAME = "ghc-old-time-prof-1.1.0.3-13.2.aarch64.rpm"
RPM_HASH = "fe2cf9eb0d5e3751cff044c84df7608ecc1e1332c4e46f6da9c3219c48533a1903db6415cb64654e8d621816d086ea5ff2bb37657d7932f60d5e6b5abcb91292"

RPROVIDES:${PN} += "ghc-old-time-prof \
ghc-prof-old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1"

RDEPENDS:${PN} += "ghc-old-time-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR"

inherit rpm
