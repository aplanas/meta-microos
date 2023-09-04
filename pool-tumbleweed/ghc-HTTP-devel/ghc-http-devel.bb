SUMMARY = "Haskell HTTP library development files"
DESCRIPTION = "This package provides the Haskell HTTP library development files."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-devel-4000.4.1-1.9.aarch64.rpm"
RPM_HASH = "123337495d56ba775c2cb3a3c013ff6d01a950158a0a7afce081d39455320364e5dde7cfbe537baee87d36b78169062c140e6524d93bd66696b04d8f4651a2cc"

RPROVIDES:${PN} += "ghc-HTTP-devel \
ghc-devel-HTTP-4000.4.1-3WMT280F7oaHvlFLV6WG4L"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-HTTP \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
