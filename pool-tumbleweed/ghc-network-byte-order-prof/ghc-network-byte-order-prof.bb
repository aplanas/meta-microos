SUMMARY = "Haskell network-byte-order profiling library"
DESCRIPTION = "This package provides the Haskell network-byte-order profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-network-byte-order-prof-0.1.6-4.3.aarch64.rpm"
RPM_HASH = "0b6596dd0a5f12aa576922a461c87cb65c57f18f9c9f03009f89f055010ff311e507ee99dde6356f67f010f1f693ea29b5e5fe850af220686b7ba7b2b755b92a"

RPROVIDES:${PN} += "ghc-network-byte-order-prof \
ghc-prof-network-byte-order-0.1.6-vRMRsceTnFFPQXnTdvJFs"

RDEPENDS:${PN} += "ghc-network-byte-order-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1"

inherit rpm
