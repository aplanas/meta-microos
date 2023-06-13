SUMMARY = "Haskell timezone-series profiling library"
DESCRIPTION = "This package provides the Haskell timezone-series profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "ghc-timezone-series-prof-0.1.13-2.2.aarch64.rpm"
RPM_HASH = "0e5a40487348155faba50fd62e845eb48fbae236ba35175dfa53756011c495e0d2534bce264c6001fe6afa23c2a89200e939a063ed465d98a4a75e6c93d40644"

RPROVIDES:${PN} += "ghc-prof(timezone-series-0.1.13-52HOboQTQ6c9WNazbzYdiK) \
ghc-timezone-series-prof \
ghc-timezone-series-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(time-1.12.2) \
ghc-timezone-series-devel"

inherit rpm
