SUMMARY = "Haskell template-haskell profiling library"
DESCRIPTION = "This package provides the Haskell template-haskell profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-prof-2.19.0.0-1.1.aarch64.rpm"
RPM_HASH = "1d45e445faeaa0e998cdaf241828e02335e0e90a86aae7dc464ac58c52df88d868907998c7996a9cd332f15ee8bfb366465dcdd218b678a7ab51887eb772e797"

RPROVIDES:${PN} += "ghc-prof(template-haskell-2.19.0.0) ghc-template-haskell-prof ghc-template-haskell-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(ghc-boot-th-9.4.5) ghc-prof(ghc-prim-0.9.0) ghc-prof(pretty-1.1.3.6) ghc-template-haskell-devel(aarch-64)"

inherit rpm
