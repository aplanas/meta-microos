SUMMARY = "Haskell time-compat profiling library"
DESCRIPTION = "This package provides the Haskell time-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.9.6.1"

RPM_NAME = "ghc-time-compat-prof-1.9.6.1-5.6.aarch64.rpm"
RPM_HASH = "4f3bb983afabb31e37edf28caa528c5091cd92e18bfd20c0e1bf8e32b18e817dfac30a3615481615d8beac670775c4908b4f5aef7d7777e4740d10f222c75ebb"

RPROVIDES:${PN} += "ghc-prof-time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82 \
ghc-time-compat-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-time-1.12.2 \
ghc-time-compat-devel"

inherit rpm
