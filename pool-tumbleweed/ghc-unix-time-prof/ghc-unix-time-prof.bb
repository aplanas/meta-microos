SUMMARY = "Haskell unix-time profiling library"
DESCRIPTION = "This package provides the Haskell unix-time profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "ghc-unix-time-prof-0.4.9-1.6.aarch64.rpm"
RPM_HASH = "d5bc3427eaf66b849b45480ef69d725dbad3aa1c8c0949818c8383454dce880b5d04044b3fa308e18c440d5b814266fbb193d01b65ac78d9acbb4da5d95d2c8e"

RPROVIDES:${PN} += "ghc-prof-unix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0 \
ghc-unix-time-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1 \
ghc-unix-time-devel"

inherit rpm
