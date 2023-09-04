SUMMARY = "Haskell topograph profiling library"
DESCRIPTION = "This package provides the Haskell topograph profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.2"

RPM_NAME = "ghc-topograph-prof-1.0.0.2-2.4.aarch64.rpm"
RPM_HASH = "878935edf4c4de35b7db3d0f167bd2e3f6cb4244bee21ae9be4c7aa9f1a113098eb1279e4631757950fc6cf8c8080b6382cff8185a7dd06a28d43818fee82496"

RPROVIDES:${PN} += "ghc-prof-topograph-1.0.0.2-5YRiUwFEAtYF8P5cpJe97E \
ghc-topograph-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-prof-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-prof-containers-0.6.7 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-topograph-devel"

inherit rpm
