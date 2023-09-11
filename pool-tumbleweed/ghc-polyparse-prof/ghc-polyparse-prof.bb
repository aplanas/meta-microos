SUMMARY = "Haskell polyparse profiling library"
DESCRIPTION = "This package provides the Haskell polyparse profiling library."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-prof-1.13-13.1.aarch64.rpm"
RPM_HASH = "6bf0c85045061b42046dcdd7fc55f0be131fb712c8c427ebf51f3a915374f275dcd34c42490f1c8c1ef6bb2f3647508c4b19736731f1c8d56d7db0bfcdebc2d8"

RPROVIDES:${PN} += "ghc-polyparse-prof \
ghc-prof-polyparse-1.13-BLB26XAC1GDzZMBJpPaUe"

RDEPENDS:${PN} += "ghc-polyparse-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-text-2.0.2"

inherit rpm
