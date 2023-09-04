SUMMARY = "Haskell network-bsd profiling library"
DESCRIPTION = "This package provides the Haskell network-bsd profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-prof-2.8.1.0-8.1.aarch64.rpm"
RPM_HASH = "fd3b59b206b9757fbc85d6f0502211e1091c1761c1baf2e997ae9d926d49e344321c15cd581dd7ae78e9bb4344d751b56f6ca6dc4eff85736963f5cba2864ddd"

RPROVIDES:${PN} += "ghc-network-bsd-prof \
ghc-prof-network-bsd-2.8.1.0-6HwBWPM2Dri1VSrR1y6aDh"

RDEPENDS:${PN} += "ghc-network-bsd-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs"

inherit rpm
