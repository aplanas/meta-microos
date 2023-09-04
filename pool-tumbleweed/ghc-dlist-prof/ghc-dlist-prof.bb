SUMMARY = "Haskell dlist profiling library"
DESCRIPTION = "This package provides the Haskell dlist profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-prof-1.0-3.3.aarch64.rpm"
RPM_HASH = "b8014bf6bacd6bc96bd78b902760331340b189462b1934b4a043b7bc3e016de8d858a9ed9701cbd423138d6225fa995da38a506dc699db512864a757fd7d095a"

RPROVIDES:${PN} += "ghc-dlist-prof \
ghc-prof-dlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ"

RDEPENDS:${PN} += "ghc-dlist-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0"

inherit rpm
