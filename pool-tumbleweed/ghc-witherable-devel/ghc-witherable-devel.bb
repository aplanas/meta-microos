SUMMARY = "Haskell witherable library development files"
DESCRIPTION = "This package provides the Haskell witherable library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-witherable-devel-0.4.2-4.6.aarch64.rpm"
RPM_HASH = "22d85a01caf9824ae713d366e4a97d94f50addc56a3bb299ace207df26b9425fa0837a76cabd119ee70b4b4328ffb8c48e4b6a9a54eb545efbc121258260d2d7"

RPROVIDES:${PN} += "ghc-devel-witherable-0.4.2-4so4KYid1UG9PchOfa6Iqw \
ghc-witherable-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-devel-indexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-witherable"

inherit rpm
