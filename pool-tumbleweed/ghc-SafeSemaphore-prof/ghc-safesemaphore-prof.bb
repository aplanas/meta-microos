SUMMARY = "Haskell SafeSemaphore profiling library"
DESCRIPTION = "This package provides the Haskell SafeSemaphore profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-prof-0.10.1-5.6.aarch64.rpm"
RPM_HASH = "b8d0a0154b36fc3d72324f2c9df24e6143714000c33432bfb1a7941e7f9037e4f216abf270d170747a399052a79196c13317cbdc68b537930596a43d7199fb23"

RPROVIDES:${PN} += "ghc-SafeSemaphore-prof \
ghc-prof-SafeSemaphore-0.10.1-4RgR0Mf1NXcDYTDfcuJnia"

RDEPENDS:${PN} += "ghc-SafeSemaphore-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-stm-2.5.1.0"

inherit rpm
