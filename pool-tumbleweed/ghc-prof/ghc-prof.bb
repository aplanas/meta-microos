SUMMARY = "GHC profiling libraries meta package"
DESCRIPTION = "Installing this package causes ghc-*-prof packages corresponding to \
ghc-*-devel packages to be automatically installed too."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-prof-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "c8f23512920badcc650df2e53d643cbb2b66c71ca281cdc098f26d7b7713241d7a0e23f03a9821d8c0127fa5fac9c2ed971edba0efe185b486385907f0246a26"

RPROVIDES:${PN} += "ghc-prof \
ghc-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-compiler"

inherit rpm
