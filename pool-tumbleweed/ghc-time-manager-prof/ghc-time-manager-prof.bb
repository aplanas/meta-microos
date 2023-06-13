SUMMARY = "Haskell time-manager profiling library"
DESCRIPTION = "This package provides the Haskell time-manager profiling library."
LICENSE = "MIT"

PV = "0.0.0"

RPM_NAME = "ghc-time-manager-prof-0.0.0-5.2.aarch64.rpm"
RPM_HASH = "5d04e2ce6c30ea24608add288fd583b5b5aed4378369d409987d596b6a9afa25c29631deac9d575f6e39f4c757d83c1a98e3896739e01640cdae04ccd05c9870"

RPROVIDES:${PN} += "ghc-prof(time-manager-0.0.0-49hD2RcPrUEG8anOiBePCj) \
ghc-time-manager-prof \
ghc-time-manager-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ) \
ghc-prof(base-4.17.1.0) \
ghc-time-manager-devel"

inherit rpm
