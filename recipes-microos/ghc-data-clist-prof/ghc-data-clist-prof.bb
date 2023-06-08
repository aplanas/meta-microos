SUMMARY = "Haskell data-clist profiling library"
DESCRIPTION = "This package provides the Haskell data-clist profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-data-clist-prof-0.2-2.2.aarch64.rpm"
RPM_HASH = "d78e8143a66f077b6fd1387aade398bcba3df7018345ffc02e353bb0b00a02fa2ba58aeb5e27ebfb4e6a8fb2e4c8dd08d3fdbc54dbee84e897c5655530458f7e"

RPROVIDES:${PN} += "ghc-data-clist-prof ghc-data-clist-prof(aarch-64) ghc-prof(data-clist-0.2-LT5UCpKeur34zcxFsnpoqW)"
RDEPENDS:${PN} += "ghc-data-clist-devel ghc-prof(base-4.17.1.0) ghc-prof(deepseq-1.4.8.0)"

inherit rpm
