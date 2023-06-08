SUMMARY = "Haskell js-chart profiling library"
DESCRIPTION = "This package provides the Haskell js-chart profiling library."
LICENSE = "MIT"

PV = "2.9.4.1"

RPM_NAME = "ghc-js-chart-prof-2.9.4.1-2.2.aarch64.rpm"
RPM_HASH = "d38e0381dd880aa99b5bfa04d3efdf0c57c75b0a0ae5a58aa36e1ae2c0961fb9a1ca76be2dc088d44a75a834273077bb591b574a11ee77127c8a9805cacb9662"

RPROVIDES:${PN} += "ghc-js-chart-prof ghc-js-chart-prof(aarch-64) ghc-prof(js-chart-2.9.4.1-3Q5pmv83RztDkZZL9zv96d)"
RDEPENDS:${PN} += "ghc-js-chart-devel ghc-prof(base-4.17.1.0)"

inherit rpm
