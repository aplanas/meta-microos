SUMMARY = "Haskell witherable profiling library"
DESCRIPTION = "This package provides the Haskell witherable profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-witherable-prof-0.4.2-4.6.aarch64.rpm"
RPM_HASH = "1fff425bc1a3b2752f78a235ae6016ad8ec27dc50b3e6ecffa1ec5a7ec9cc906d7f5881b41fd8b8065f67e84fabd6332191d38b10802db4173b40fc5c2086650"

RPROVIDES:${PN} += "ghc-prof-witherable-0.4.2-4so4KYid1UG9PchOfa6Iqw \
ghc-witherable-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-prof-indexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-witherable-devel"

inherit rpm
