SUMMARY = "Haskell foldable1-classes-compat profiling library"
DESCRIPTION = "This package provides the Haskell foldable1-classes-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-foldable1-classes-compat-prof-0.1-1.3.aarch64.rpm"
RPM_HASH = "87eb6e93f8b6e31cfe56eac78616961ac3da2af2500c0d5eabd233f30929c1e95d93df08d872f9170cb9b3e84272c35729d81e3dc2ee486cf70d3bff75016922"

RPROVIDES:${PN} += "ghc-foldable1-classes-compat-prof \
ghc-prof-foldable1-classes-compat-0.1-JP9wXcYYGsT10VsvIV9rpl"

RDEPENDS:${PN} += "ghc-foldable1-classes-compat-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-transformers-0.5.6.2"

inherit rpm
