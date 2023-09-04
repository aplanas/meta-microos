SUMMARY = "Haskell resource-pool profiling library"
DESCRIPTION = "This package provides the Haskell resource-pool profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-resource-pool-prof-0.4.0.0-2.9.aarch64.rpm"
RPM_HASH = "7cf85411f314c2088928efcd55a52ce90b5e1569ac58a8154654e75a3488674479f2a6c019565dc546596c7d0f85eb25395346405f75b47dc6a1a7a03f0bab6b"

RPROVIDES:${PN} += "ghc-prof-resource-pool-0.4.0.0-7uUtnYEtaeP22tTkIEO3ty \
ghc-resource-pool-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-time-1.12.2 \
ghc-resource-pool-devel"

inherit rpm
