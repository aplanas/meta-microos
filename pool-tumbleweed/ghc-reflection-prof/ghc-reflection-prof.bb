SUMMARY = "Haskell reflection profiling library"
DESCRIPTION = "This package provides the Haskell reflection profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.1.7"

RPM_NAME = "ghc-reflection-prof-2.1.7-1.3.aarch64.rpm"
RPM_HASH = "058f77a76232f39b341af33cd4d40b81a8fded7d37e51c6bd8dfb3e31c25b3c9d7998f34cd3d381ac865f0f3be9b3abacb87af90a8441b6f78abbd455886ee6c"

RPROVIDES:${PN} += "ghc-prof-reflection-2.1.7-1WygFxHmxkcEQBv8T6gHut \
ghc-reflection-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-reflection-devel"

inherit rpm
