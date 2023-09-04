SUMMARY = "Haskell th-lift-instances profiling library"
DESCRIPTION = "This package provides the Haskell th-lift-instances profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.20"

RPM_NAME = "ghc-th-lift-instances-prof-0.1.20-2.4.aarch64.rpm"
RPM_HASH = "be697c76be3c8a2b3524b02a5557c1b5e61bfa323d82558ff55b4844d084298b7771dc72d02e33d368a9f9716ce718a85d92015271149972b36e40073de9baa4"

RPROVIDES:${PN} += "ghc-prof-th-lift-instances-0.1.20-BKODVtFlRayDjKs9vGaGq3 \
ghc-th-lift-instances-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-th-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-th-lift-instances-devel"

inherit rpm
