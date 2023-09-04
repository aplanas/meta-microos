SUMMARY = "Haskell unordered-containers profiling library"
DESCRIPTION = "This package provides the Haskell unordered-containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.19.1"

RPM_NAME = "ghc-unordered-containers-prof-0.2.19.1-3.9.aarch64.rpm"
RPM_HASH = "c5115a5bbd3626048b3a62a5b0df68927ebe56f07c30956e570d0d402514380d499629c0e086e29ce57c25c816b27e887a37919afd6d91cc728a9476297a0a7f"

RPROVIDES:${PN} += "ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-unordered-containers-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-template-haskell-2.19.0.0 \
ghc-unordered-containers-devel"

inherit rpm
