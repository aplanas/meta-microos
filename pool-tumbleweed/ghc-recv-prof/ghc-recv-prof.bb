SUMMARY = "Haskell recv profiling library"
DESCRIPTION = "This package provides the Haskell recv profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-recv-prof-0.1.0-1.8.aarch64.rpm"
RPM_HASH = "0bdeeba46d9d8394280e368ac5e558df880c539fb71cc13666f2bcf02b751902e0a5fd50651fff2df35dce0c7b60bfb9b9596c86dcb3f78b228b795c8989d18b"

RPROVIDES:${PN} += "ghc-prof-recv-0.1.0-E4Of8dJv2WfHRGIVsQUgMj \
ghc-recv-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-recv-devel"

inherit rpm
