SUMMARY = "Haskell parallel profiling library"
DESCRIPTION = "This package provides the Haskell parallel profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-prof-3.2.2.0-12.6.aarch64.rpm"
RPM_HASH = "1beabd35d03998b1b9b69643e169b86a2f047fde5d1958302b37da386baaeee39f1b6fb202ca9293b0ada8221bea270c16aaf712122068e4eb30528547ff0788"

RPROVIDES:${PN} += "ghc-parallel-prof \
ghc-prof-parallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr"

RDEPENDS:${PN} += "ghc-parallel-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0"

inherit rpm
