SUMMARY = "Haskell comonad profiling library"
DESCRIPTION = "This package provides the Haskell comonad profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.0.8"

RPM_NAME = "ghc-comonad-prof-5.0.8-3.6.aarch64.rpm"
RPM_HASH = "41d7f598c3778503027302e8e8ab724d8d69e3b45b255c7788a76f7fcff58a7bba2a3ee327ccf226ae9e1ac52835e4f69aee772ac3496af0dc3a72e7e230fae0"

RPROVIDES:${PN} += "ghc-comonad-prof \
ghc-prof-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4"

RDEPENDS:${PN} += "ghc-comonad-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79 \
ghc-prof-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd"

inherit rpm
