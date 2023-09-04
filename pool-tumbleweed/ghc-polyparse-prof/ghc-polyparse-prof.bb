SUMMARY = "Haskell polyparse profiling library"
DESCRIPTION = "This package provides the Haskell polyparse profiling library."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-prof-1.13-12.3.aarch64.rpm"
RPM_HASH = "8f2b2840763bb09873a591f609b6aec5362e61a850e43eb04dbe1dd1c482a6eb235dacd24fd39e34fa0c622f6941757a8071123aa2ab23abdd649320849e34c5"

RPROVIDES:${PN} += "ghc-polyparse-prof \
ghc-prof-polyparse-1.13-BLB26XAC1GDzZMBJpPaUe"

RDEPENDS:${PN} += "ghc-polyparse-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-text-2.0.2"

inherit rpm
