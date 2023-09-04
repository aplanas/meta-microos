SUMMARY = "Haskell network-multicast profiling library"
DESCRIPTION = "This package provides the Haskell network-multicast profiling library."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-prof-0.3.2-4.4.aarch64.rpm"
RPM_HASH = "65546821ccd6c5e086d253dd6505c9b71c04928358f8d37d545f9481830fb88c4c5529cd3313ff788f68ef9427854890f79d26a7a9fbec7b6031e38b07800f32"

RPROVIDES:${PN} += "ghc-network-multicast-prof \
ghc-prof-network-multicast-0.3.2-49FavpxpKt9CEnvETsCD9h"

RDEPENDS:${PN} += "ghc-network-multicast-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-network-bsd-2.8.1.0-6HwBWPM2Dri1VSrR1y6aDh"

inherit rpm
