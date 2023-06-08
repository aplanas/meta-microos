SUMMARY = "Haskell SHA profiling library"
DESCRIPTION = "This package provides the Haskell SHA profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.4.4"

RPM_NAME = "ghc-SHA-prof-1.6.4.4-8.2.aarch64.rpm"
RPM_HASH = "c2e0512a01aee509fa64128c1e653303f59e93394df0d5b0b17b60ffc046bbafe9c4c2d703564284c2e6969cff5e346b0fd08045a05ddb68283ef14e646a2e07"

RPROVIDES:${PN} += "ghc-SHA-prof ghc-SHA-prof(aarch-64) ghc-prof(SHA-1.6.4.4-CTRZ9m1gmyY35Z2xnCckJW)"
RDEPENDS:${PN} += "ghc-SHA-devel ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0)"

inherit rpm
