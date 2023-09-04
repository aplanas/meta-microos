SUMMARY = "Haskell Decimal profiling library"
DESCRIPTION = "This package provides the Haskell Decimal profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "ghc-Decimal-prof-0.5.2-2.3.aarch64.rpm"
RPM_HASH = "5d0e41c9134e5b9f046f87b0cd8057ae49f6e75f9c527c49838c8dfb8c276655cbfb572e4f9800d693f7b834887b6d0204c33b17f7532a403b289752548ab8ec"

RPROVIDES:${PN} += "ghc-Decimal-prof \
ghc-prof-Decimal-0.5.2-7hu5LwisxJT2rqtwM7eQhT"

RDEPENDS:${PN} += "ghc-Decimal-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0"

inherit rpm
