SUMMARY = "Haskell ghc-compact profiling library"
DESCRIPTION = "This package provides the Haskell ghc-compact profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-prof-0.1.0.0-3.1.aarch64.rpm"
RPM_HASH = "28a2f6ff2112e9f43372e7a33b2dad1db77e3b6281d43569d753bae83b89b3d7d1aa3f274b631e3b7adc8c0e1cfe90f767ca79ea3c5cf311a3b1126346669b2d"

RPROVIDES:${PN} += "ghc-ghc-compact-prof ghc-ghc-compact-prof(aarch-64) ghc-prof(ghc-compact-0.1.0.0)"
RDEPENDS:${PN} += "ghc-ghc-compact-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(ghc-prim-0.9.0)"

inherit rpm
