SUMMARY = "Haskell tabular profiling library"
DESCRIPTION = "This package provides the Haskell tabular profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.8"

RPM_NAME = "ghc-tabular-prof-0.2.2.8-4.3.aarch64.rpm"
RPM_HASH = "004d802507076d7a6555a11a2ce6f8def350dbb20e9f7d71bec13aa589ed480859eebf5904f70318493b5449e1528ff542d08fdf96abeaf9df2e380b3946fab1"

RPROVIDES:${PN} += "ghc-prof(tabular-0.2.2.8-5oBUDJP9F9qUMGPeotGAp) \
ghc-tabular-prof \
ghc-tabular-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(csv-0.1.2-LKioaw43aTAAAKpIk04xxN) \
ghc-prof(html-1.0.1.2-U7qWIp0bJwCnAFPlj3UZy) \
ghc-prof(mtl-2.2.2) \
ghc-tabular-devel"

inherit rpm
