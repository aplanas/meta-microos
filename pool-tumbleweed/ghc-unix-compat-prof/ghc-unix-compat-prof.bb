SUMMARY = "Haskell unix-compat profiling library"
DESCRIPTION = "This package provides the Haskell unix-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "ghc-unix-compat-prof-0.6-3.8.aarch64.rpm"
RPM_HASH = "fa81dda79347d6f7879fedf4e0676e27426efdc2f0dc7109b20f57e61659845b9e5471c3b0a837290c292aede65d068ad261e37ad612b0483b2ab83ccc134416"

RPROVIDES:${PN} += "ghc-prof-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei \
ghc-unix-compat-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-unix-2.7.3 \
ghc-unix-compat-devel"

inherit rpm
