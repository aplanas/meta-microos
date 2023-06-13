SUMMARY = "Haskell th-lift profiling library"
DESCRIPTION = "This package provides the Haskell th-lift profiling library."
LICENSE = "(BSD-3-Clause | GPL-2.0-only)"

PV = "0.8.3"

RPM_NAME = "ghc-th-lift-prof-0.8.3-1.2.aarch64.rpm"
RPM_HASH = "1dfe95d5b07d1188e08208c50651d1fae354314c47e1152963b5367e5b71a415a35855d4d311dc333deacb29f4df26d408631850dbccfd11e4d7887eb00d44c4"

RPROVIDES:${PN} += "ghc-prof(th-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN) \
ghc-th-lift-prof \
ghc-th-lift-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(ghc-prim-0.9.0) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-prof(th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT) \
ghc-th-lift-devel"

inherit rpm
