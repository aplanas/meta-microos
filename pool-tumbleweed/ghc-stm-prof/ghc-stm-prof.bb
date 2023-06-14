SUMMARY = "Haskell stm profiling library"
DESCRIPTION = "This package provides the Haskell stm profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-prof-2.5.1.0-3.1.aarch64.rpm"
RPM_HASH = "7eeacfa94f6b0964713ab3936087be66592bf5b36f5867eea5ff43cd32bd7ed0c64609e19fe4eec33359aee7d30b9ff43c58c6a7cb86b29f3b01fdf7eb9a7d16"

RPROVIDES:${PN} += "ghc-prof-stm-2.5.1.0 \
ghc-stm-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-stm-devel"

inherit rpm
