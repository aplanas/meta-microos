SUMMARY = "Haskell network-byte-order profiling library"
DESCRIPTION = "This package provides the Haskell network-byte-order profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-network-byte-order-prof-0.1.6-4.2.aarch64.rpm"
RPM_HASH = "6e12cbc53307ff0bfad80aedfe71af27abdbd02103a221f726701c322adcd12b8995debb5de9b5da2cffd2f282f525c078fe26bc66508fefba9b929773bdd734"

RPROVIDES:${PN} += "ghc-network-byte-order-prof \
ghc-network-byte-order-prof(aarch-64) \
ghc-prof(network-byte-order-0.1.6-9jNlcwvZjC3K8A2S0a4vrO)"
RDEPENDS:${PN} += "ghc-network-byte-order-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0)"

inherit rpm
