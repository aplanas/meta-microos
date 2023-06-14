SUMMARY = "Haskell polyparse profiling library"
DESCRIPTION = "This package provides the Haskell polyparse profiling library."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-prof-1.13-10.3.aarch64.rpm"
RPM_HASH = "db31eec5728e81813d313bcff2ccf4584d0c6cadd7c4375310d95b92eab053007e3e2388f29922672ef74dceb1f3b12045b4ce560b91df053e9690793bf40b5f"

RPROVIDES:${PN} += "ghc-polyparse-prof \
ghc-prof-polyparse-1.13-E8FdqtcSqxM3P2njDFrYm8"

RDEPENDS:${PN} += "ghc-polyparse-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-text-2.0.2"

inherit rpm
