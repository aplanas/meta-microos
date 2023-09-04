SUMMARY = "Haskell HTTP profiling library"
DESCRIPTION = "This package provides the Haskell HTTP profiling library."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-prof-4000.4.1-1.9.aarch64.rpm"
RPM_HASH = "46103991e90fff212b96078177174abd98da214382c27f38e4a1155ec4ca667b602a29d59dd011df120e89ed7b52a3bafd9c2c80a2a44b1c4485e89a002782aa"

RPROVIDES:${PN} += "ghc-HTTP-prof \
ghc-prof-HTTP-4000.4.1-3WMT280F7oaHvlFLV6WG4L"

RDEPENDS:${PN} += "ghc-HTTP-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
