SUMMARY = "Haskell dlist profiling library"
DESCRIPTION = "This package provides the Haskell dlist profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-prof-1.0-4.1.aarch64.rpm"
RPM_HASH = "167612275fcf063ebb14753e491dd3fd641b2ceac2dac0d270ffd6ce7d40358a3bc17817c01ce82c07c35796e57cfa1f3c77046e71683641ec08cfcbc0fe55fe"

RPROVIDES:${PN} += "ghc-dlist-prof \
ghc-prof-dlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ"

RDEPENDS:${PN} += "ghc-dlist-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0"

inherit rpm
