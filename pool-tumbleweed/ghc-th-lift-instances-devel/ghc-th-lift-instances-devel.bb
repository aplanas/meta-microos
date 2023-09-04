SUMMARY = "Haskell th-lift-instances library development files"
DESCRIPTION = "This package provides the Haskell th-lift-instances library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.20"

RPM_NAME = "ghc-th-lift-instances-devel-0.1.20-2.4.aarch64.rpm"
RPM_HASH = "435a3d88de0812d23a767844947b1ea5698430cc564326a50aa963c41a62fd032bd4e90595e3f4fa84a5a43792d3adea7c7ba79cbb4de0931d2949e0ed6a8e37"

RPROVIDES:${PN} += "ghc-devel-th-lift-instances-0.1.20-BKODVtFlRayDjKs9vGaGq3 \
ghc-th-lift-instances-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-th-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-th-lift-instances"

inherit rpm
