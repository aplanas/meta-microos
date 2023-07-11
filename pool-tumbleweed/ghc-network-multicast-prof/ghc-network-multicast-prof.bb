SUMMARY = "Haskell network-multicast profiling library"
DESCRIPTION = "This package provides the Haskell network-multicast profiling library."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-prof-0.3.2-4.3.aarch64.rpm"
RPM_HASH = "2707e009188343c8314c80bbecfc5c575985a3a7f482c66da295001e06a6f8a2206b4f0d8782dedbecfb51806f7f17bbb1504efe9d88b6ca2f627b5e508428a5"

RPROVIDES:${PN} += "ghc-network-multicast-prof \
ghc-prof-network-multicast-0.3.2-4WWinAJ7bwBLL5fL2eaYym"

RDEPENDS:${PN} += "ghc-network-multicast-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-network-bsd-2.8.1.0-K9geVudEUPh9zpSal1iibE"

inherit rpm
