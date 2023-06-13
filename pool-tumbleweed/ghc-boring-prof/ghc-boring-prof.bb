SUMMARY = "Haskell boring profiling library"
DESCRIPTION = "This package provides the Haskell boring profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-boring-prof-0.2.1-1.2.aarch64.rpm"
RPM_HASH = "1d3e9fc1f2fec5221b4c6337338c47c1d4a86ccdcf1aec91378263f21d08e6ff751be7c235dd3005ab46d7ca7a2fd8da913737f44ed09199a9e591459da2d439"

RPROVIDES:${PN} += "ghc-boring-prof \
ghc-boring-prof(aarch-64) \
ghc-prof(boring-0.2.1-J8lJX6Vz53r2bssyBwOtpl)"

RDEPENDS:${PN} += "ghc-boring-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-prof(transformers-0.5.6.2)"

inherit rpm
