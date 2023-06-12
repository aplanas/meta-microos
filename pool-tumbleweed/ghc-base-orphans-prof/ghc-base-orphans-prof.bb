SUMMARY = "Haskell base-orphans profiling library"
DESCRIPTION = "This package provides the Haskell base-orphans profiling library."
LICENSE = "MIT"

PV = "0.8.8.2"

RPM_NAME = "ghc-base-orphans-prof-0.8.8.2-1.2.aarch64.rpm"
RPM_HASH = "0b2410d56c25241e4989e44c9c7b028b17f911b1ce62a1960c662f067f7703456cd334ea087eb162e4b4588e1d109c76eb2650905763551b4f2ebc2101b6a2d7"

RPROVIDES:${PN} += "ghc-base-orphans-prof \
ghc-base-orphans-prof(aarch-64) \
ghc-prof(base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8)"
RDEPENDS:${PN} += "ghc-base-orphans-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(ghc-prim-0.9.0)"

inherit rpm
