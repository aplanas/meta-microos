SUMMARY = "Haskell polyparse profiling library"
DESCRIPTION = "This package provides the Haskell polyparse profiling library."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-prof-1.13-11.1.aarch64.rpm"
RPM_HASH = "23e7d9e46dce8303cdb5667943d738f787539a590f27ee8fe3bf7a14488313d14d50c8e2c1313345e5e01d4fdff29c2d0ab3e38557a7582ee859401fccb70cda"

RPROVIDES:${PN} += "ghc-polyparse-prof \
ghc-prof-polyparse-1.13-E8FdqtcSqxM3P2njDFrYm8"

RDEPENDS:${PN} += "ghc-polyparse-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-text-2.0.2"

inherit rpm
