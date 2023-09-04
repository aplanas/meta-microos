SUMMARY = "Haskell stm profiling library"
DESCRIPTION = "This package provides the Haskell stm profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-prof-2.5.1.0-1.1.aarch64.rpm"
RPM_HASH = "43b5bd4ad9e408f67c31dfab5a809cc28f280ba0f6a566a3dcd9a621f0c14aff499304f5da3fbd29334590128c0b463c50f0e65a222b142f1eb63a299feac38a"

RPROVIDES:${PN} += "ghc-prof-stm-2.5.1.0 \
ghc-stm-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-stm-devel"

inherit rpm
