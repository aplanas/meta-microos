SUMMARY = "Haskell filepath profiling library"
DESCRIPTION = "This package provides the Haskell filepath profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-prof-1.4.2.2-1.1.aarch64.rpm"
RPM_HASH = "662df406815e577536c887a4b8bada992ebe08ecb4d884ba3d1196b586738f0e05b6361ec22234c6bce3b74a4e38d2a08b687355c21728d43372409fad7db7fb"

RPROVIDES:${PN} += "ghc-filepath-prof \
ghc-prof-filepath-1.4.2.2"

RDEPENDS:${PN} += "ghc-filepath-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
