SUMMARY = "Haskell fgl profiling library"
DESCRIPTION = "This package provides the Haskell fgl profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.8.0.0"

RPM_NAME = "ghc-fgl-prof-5.8.0.0-3.4.aarch64.rpm"
RPM_HASH = "631289adb25cf5cd82a118df1adb660503f9272aa437b6fe11a0086e5668a54727d1787582c4521e10a6ca4f5f333fdae6a2a65604e69e0af8388bbac8dccb75"

RPROVIDES:${PN} += "ghc-fgl-prof \
ghc-prof-fgl-5.8.0.0-JXOHdIncLQ9K05kSZoGOKU"

RDEPENDS:${PN} += "ghc-fgl-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
