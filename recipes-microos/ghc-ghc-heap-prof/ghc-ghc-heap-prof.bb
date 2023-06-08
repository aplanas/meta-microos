SUMMARY = "Haskell ghc-heap profiling library"
DESCRIPTION = "This package provides the Haskell ghc-heap profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-heap-prof-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "3875612fe4abfe44c29a12c93f14c95308658845ff01064284d252e9d1e8fb825e952fab55ea18a1e09efaf274294ed59db494adf4d976c84c107120520e3962"

RPROVIDES:${PN} += "ghc-ghc-heap-prof ghc-ghc-heap-prof(aarch-64) ghc-prof(ghc-heap-9.4.5)"
RDEPENDS:${PN} += "ghc-ghc-heap-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(ghc-prim-0.9.0) ghc-prof(rts-1.0.2)"

inherit rpm
