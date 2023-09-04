SUMMARY = "Haskell data-fix profiling library"
DESCRIPTION = "This package provides the Haskell data-fix profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.2"

RPM_NAME = "ghc-data-fix-prof-0.3.2-4.4.aarch64.rpm"
RPM_HASH = "1639c04364ec21501ad58cf1c52016e8b19eff3c5747968c62c142dd14af32143d3f97889bfa2cdcf2f9530ee1c9658d4da681386ec331c8b1b6063c97818281"

RPROVIDES:${PN} += "ghc-data-fix-prof \
ghc-prof-data-fix-0.3.2-Hesv2p3MUF3H2yKikhD4Es"

RDEPENDS:${PN} += "ghc-data-fix-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP"

inherit rpm
