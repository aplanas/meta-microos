SUMMARY = "Haskell polyparse profiling library"
DESCRIPTION = "This package provides the Haskell polyparse profiling library."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-prof-1.13-10.6.aarch64.rpm"
RPM_HASH = "b0e3be197783b9cac18093d0e6b0212cbe05c196089013d6b09fbad2e0f06be5ac6ecdb1d5de048049f47588611d73e9c46fabfaab9406f5341df15f552794eb"

RPROVIDES:${PN} += "ghc-polyparse-prof \
ghc-prof-polyparse-1.13-E8FdqtcSqxM3P2njDFrYm8"

RDEPENDS:${PN} += "ghc-polyparse-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-text-2.0.2"

inherit rpm
