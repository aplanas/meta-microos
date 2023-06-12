SUMMARY = "Haskell deepseq profiling library"
DESCRIPTION = "This package provides the Haskell deepseq profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-prof-1.4.8.0-3.1.aarch64.rpm"
RPM_HASH = "3d43cb8600b2aa8f90121f6f8191127bb1c19918862d5af26420312d0a1a008edb7d7b02740104af301f09f8105fde007ca477e2b9fee6f3abfcf7644792714b"

RPROVIDES:${PN} += "ghc-deepseq-prof ghc-deepseq-prof(aarch-64) ghc-prof(deepseq-1.4.8.0)"
RDEPENDS:${PN} += "ghc-deepseq-devel(aarch-64) ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(ghc-prim-0.9.0)"

inherit rpm
