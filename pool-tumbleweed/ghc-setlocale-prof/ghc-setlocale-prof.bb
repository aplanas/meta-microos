SUMMARY = "Haskell setlocale profiling library"
DESCRIPTION = "This package provides the Haskell setlocale profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-prof-1.0.0.10-4.3.aarch64.rpm"
RPM_HASH = "87739e6dd3a43c22f0d1b5f86176aa49fe0997200b052aafaa4ff7c0e568f56c0d6953fa2200e67a5c9b30308370160d1d029272fe1d94d5cffd022feb4bb1bc"

RPROVIDES:${PN} += "ghc-prof-setlocale-1.0.0.10-EX0ACS22UctCUxDRUitp1V \
ghc-setlocale-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-setlocale-devel"

inherit rpm
