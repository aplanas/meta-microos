SUMMARY = "Haskell data-default-class profiling library"
DESCRIPTION = "This package provides the Haskell data-default-class profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.2.0"

RPM_NAME = "ghc-data-default-class-prof-0.1.2.0-10.3.aarch64.rpm"
RPM_HASH = "81da5fa41c402c89694df4246255d81e5c46fc0961e463c048f2274f28abff03c8eb2a83200c6f1ef63979898e08ee38a9b1de945d406c6703c2598e8482e894"

RPROVIDES:${PN} += "ghc-data-default-class-prof \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN"

RDEPENDS:${PN} += "ghc-data-default-class-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
