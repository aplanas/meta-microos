SUMMARY = "Haskell tasty-rerun library development files"
DESCRIPTION = "This package provides the Haskell tasty-rerun library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.18"

RPM_NAME = "ghc-tasty-rerun-devel-1.1.18-6.2.aarch64.rpm"
RPM_HASH = "dc5dd560069c24625f6c97812acf78ed65927f47e6120546d9b16a348943fc60f5c572b5f9fbe7ecdbb85dcdedd7be97b0f84c8119514035a1aeecb4dccf001c"

RPROVIDES:${PN} += "ghc-devel-tasty-rerun-1.1.18-901DN5WLpsB5zohVN159Pf \
ghc-tasty-rerun-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-optparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB \
ghc-devel-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-devel-stm-2.5.1.0 \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-tasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz \
ghc-devel-transformers-0.5.6.2 \
ghc-tasty-rerun"

inherit rpm
