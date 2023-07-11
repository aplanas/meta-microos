SUMMARY = "Haskell network-bsd profiling library"
DESCRIPTION = "This package provides the Haskell network-bsd profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-prof-2.8.1.0-7.3.aarch64.rpm"
RPM_HASH = "1fb675c65c17cbd9964877b77d419b4cf201fbacbea9d6feb3292c00878650e728f8cd10147e91bd6c4625c11f5f6db40ca90d9b8e403e1d348d90757ef739f1"

RPROVIDES:${PN} += "ghc-network-bsd-prof \
ghc-prof-network-bsd-2.8.1.0-K9geVudEUPh9zpSal1iibE"

RDEPENDS:${PN} += "ghc-network-bsd-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc"

inherit rpm
