SUMMARY = "GHC profiling libraries meta package"
DESCRIPTION = "Installing this package causes ghc-*-prof packages corresponding to \
ghc-*-devel packages to be automatically installed too."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-prof-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "c236ae2820ac3957c9128957d6060fd7d53761b0410e95a3fac1f4f80ade4fefed5e6363ef6845948a715edd481de9128be6ab53334ae89c59550e1e44b58adc"

RPROVIDES:${PN} += "ghc-prof ghc-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler"

inherit rpm
