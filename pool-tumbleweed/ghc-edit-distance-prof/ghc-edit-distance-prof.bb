SUMMARY = "Haskell edit-distance profiling library"
DESCRIPTION = "This package provides the Haskell edit-distance profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-prof-0.2.2.1-13.6.aarch64.rpm"
RPM_HASH = "cc55b5c6d3ad4fd67ec80f3f1cb647fbcc3750790b7b9ff9cc4a56989fd07d635cafa19f283f0fd78becf040ad22780d94cfae0f082ae9c8478f23eec8d8f168"

RPROVIDES:${PN} += "ghc-edit-distance-prof \
ghc-prof-edit-distance-0.2.2.1-6sqaVuKvJlk4f2SjC0p5nu"

RDEPENDS:${PN} += "ghc-edit-distance-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o"

inherit rpm
