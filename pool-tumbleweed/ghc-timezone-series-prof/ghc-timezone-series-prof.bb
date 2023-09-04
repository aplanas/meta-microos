SUMMARY = "Haskell timezone-series profiling library"
DESCRIPTION = "This package provides the Haskell timezone-series profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "ghc-timezone-series-prof-0.1.13-2.3.aarch64.rpm"
RPM_HASH = "a5c59ff8a0b2b8921e1294706e2c8d044bab945749bf323133f57ee6d60ce06e47a20eda7c9787747a5451754f57ad5481ec4b540d6b14368d89868cc9e839e0"

RPROVIDES:${PN} += "ghc-prof-timezone-series-0.1.13-IHWQx2h4brT4vl06IuBnhA \
ghc-timezone-series-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-time-1.12.2 \
ghc-timezone-series-devel"

inherit rpm
