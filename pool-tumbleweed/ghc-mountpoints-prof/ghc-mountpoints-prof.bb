SUMMARY = "Haskell mountpoints profiling library"
DESCRIPTION = "This package provides the Haskell mountpoints profiling library."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-prof-1.0.2-4.3.aarch64.rpm"
RPM_HASH = "f9aea20552623fdf15330113f9d35898d860b0b5bb51e5c5229c1ebea911e6e034913a6e66d4066e1e5c23e6e3c2551f411cd367874f0e2e783991775e395267"

RPROVIDES:${PN} += "ghc-mountpoints-prof \
ghc-prof-mountpoints-1.0.2-1s316lA2PKMJiFY8pZCQYD"

RDEPENDS:${PN} += "ghc-mountpoints-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
