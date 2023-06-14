SUMMARY = "Haskell resource-pool profiling library"
DESCRIPTION = "This package provides the Haskell resource-pool profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-resource-pool-prof-0.4.0.0-2.3.aarch64.rpm"
RPM_HASH = "55158fa20f0910c0302c77d5c81c63fc4c5a862a4dc79302564b33877ce351a40114c8e341c2c05ed93f142b094e4759b84e812612c929c405c8c4da505bd98b"

RPROVIDES:${PN} += "ghc-prof-resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW \
ghc-resource-pool-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-time-1.12.2 \
ghc-resource-pool-devel"

inherit rpm
