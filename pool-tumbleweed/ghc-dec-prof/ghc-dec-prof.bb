SUMMARY = "Haskell dec profiling library"
DESCRIPTION = "This package provides the Haskell dec profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.5"

RPM_NAME = "ghc-dec-prof-0.0.5-2.2.aarch64.rpm"
RPM_HASH = "8a8e04d5e3c471641d5e30dfad94429663cdd0c2ea9c5c7906da93da949df1e891639d3136b6cb6314e6720b281aafd82157c7def390167df1cd6665e314eb31"

RPROVIDES:${PN} += "ghc-dec-prof \
ghc-dec-prof(aarch-64) \
ghc-prof(dec-0.0.5-4k85S2UkQTWCpK3j0IuOFm)"

RDEPENDS:${PN} += "ghc-dec-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(boring-0.2.1-J8lJX6Vz53r2bssyBwOtpl)"

inherit rpm
