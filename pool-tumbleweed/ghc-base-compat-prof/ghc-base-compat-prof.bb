SUMMARY = "Haskell base-compat profiling library"
DESCRIPTION = "This package provides the Haskell base-compat profiling library."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-prof-0.13.0-1.3.aarch64.rpm"
RPM_HASH = "c0d9e90e727a9bdac8d4ea9ef615990c8453dae228fc35a0419a2c0af58a55a7fbb4a334771567534273f648709f780a643280de0f1770697f49bec40ecab51b"

RPROVIDES:${PN} += "ghc-base-compat-prof \
ghc-prof-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3"

RDEPENDS:${PN} += "ghc-base-compat-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-unix-2.7.3"

inherit rpm
