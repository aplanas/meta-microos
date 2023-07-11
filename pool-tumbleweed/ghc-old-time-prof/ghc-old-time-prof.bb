SUMMARY = "Haskell old-time profiling library"
DESCRIPTION = "This package provides the Haskell old-time profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.3"

RPM_NAME = "ghc-old-time-prof-1.1.0.3-13.3.aarch64.rpm"
RPM_HASH = "04f79934baff7154392f8f527f5da7a9e710d49085714d64c9d1780b4be34e7f9dde99a4090231a25394ce35ea833f4cac356467df6d7ec8d8c1b97f1f3c2597"

RPROVIDES:${PN} += "ghc-old-time-prof \
ghc-prof-old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1"

RDEPENDS:${PN} += "ghc-old-time-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR"

inherit rpm
