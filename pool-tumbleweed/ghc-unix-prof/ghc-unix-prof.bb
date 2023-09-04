SUMMARY = "Haskell unix profiling library"
DESCRIPTION = "This package provides the Haskell unix profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-prof-2.7.3-1.1.aarch64.rpm"
RPM_HASH = "c9b485eb2bfa12b0050a7d3b03a75ab4044577f2e599f154c15806ccecc0a142f80b1e0a0e33a8ad6a3ffbe78d66d5d67c27edb95106ad26327613bcac5637e2"

RPROVIDES:${PN} += "ghc-prof-unix-2.7.3 \
ghc-unix-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-time-1.12.2 \
ghc-unix-devel"

inherit rpm
