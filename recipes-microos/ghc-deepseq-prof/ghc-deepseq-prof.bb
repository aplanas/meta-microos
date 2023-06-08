SUMMARY = "Haskell deepseq profiling library"
DESCRIPTION = "This package provides the Haskell deepseq profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-prof-1.4.8.0-1.1.aarch64.rpm"
RPM_HASH = "d45f7ce3ed6fbd0665e1f4b1bcd496ae29de7eae249b5eb3652cdab513333f567dc82568cac0008fb318e09e72d0bd5ba1a562b8812477b5bdd081bf5a0f6dd1"

RPROVIDES:${PN} += "ghc-deepseq-prof ghc-deepseq-prof(aarch-64) ghc-prof(deepseq-1.4.8.0)"
RDEPENDS:${PN} += "ghc-deepseq-devel(aarch-64) ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(ghc-prim-0.9.0)"

inherit rpm
