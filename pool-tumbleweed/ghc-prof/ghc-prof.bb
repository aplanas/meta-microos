SUMMARY = "GHC profiling libraries meta package"
DESCRIPTION = "Installing this package causes ghc-*-prof packages corresponding to \
ghc-*-devel packages to be automatically installed too."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-prof-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "10f56aef356e2ed4b43fb3777430b07d37601e3d71409cd6a65dd6bb43909052cf3a3f62c57f484d460b21d29eb36f0326f42b20f14b56319dc1cc8393ee916c"

RPROVIDES:${PN} += "ghc-prof"

RDEPENDS:${PN} += "ghc-compiler"

inherit rpm
