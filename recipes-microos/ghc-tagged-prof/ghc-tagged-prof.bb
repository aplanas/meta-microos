SUMMARY = "Haskell tagged profiling library"
DESCRIPTION = "This package provides the Haskell tagged profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.7"

RPM_NAME = "ghc-tagged-prof-0.8.7-1.3.aarch64.rpm"
RPM_HASH = "db03af6d67e0f7abeb0ec1b0df67466a84f38c70790be98c76cfac0bfe672a49700c0360b68f6783f6f0d21e89e137b1b75ccc5289b2ea20ac995abf9e4c54ff"

RPROVIDES:${PN} += "ghc-prof(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-tagged-prof \
ghc-tagged-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-prof(transformers-0.5.6.2) \
ghc-tagged-devel"

inherit rpm
