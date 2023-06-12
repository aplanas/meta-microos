SUMMARY = "Haskell filepath profiling library"
DESCRIPTION = "This package provides the Haskell filepath profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-prof-1.4.2.2-3.1.aarch64.rpm"
RPM_HASH = "e403b38e3355dc1ab754ec93a4460ccb39b8548e0cb7e2e54831b15ad7ad7b3c76dcb8a1a72d1a2929c24274fa02537dd412299cfa799c5378abf6d226e08c7a"

RPROVIDES:${PN} += "ghc-filepath-prof ghc-filepath-prof(aarch-64) ghc-prof(filepath-1.4.2.2)"
RDEPENDS:${PN} += "ghc-filepath-devel(aarch-64) ghc-prof(base-4.17.1.0)"

inherit rpm
