SUMMARY = "Haskell lucid profiling library"
DESCRIPTION = "This package provides the Haskell lucid profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.11.20230408"

RPM_NAME = "ghc-lucid-prof-2.11.20230408-1.6.aarch64.rpm"
RPM_HASH = "db425826761422ce18f55cc825c4f96d1d505c23798ee2dd8eb21e6a0296edbc968b9164c56d21d0df209f54206c165ab7627e5e0e5f3b1df79ff6e81809cb2b"

RPROVIDES:${PN} += "ghc-lucid-prof \
ghc-prof-lucid-2.11.20230408-4cKgK8hqgER6myHRF5jLTD"

RDEPENDS:${PN} += "ghc-lucid-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-mmorph-1.2.0-8vW65Nxa2ivI7uZwSjYXdn \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
