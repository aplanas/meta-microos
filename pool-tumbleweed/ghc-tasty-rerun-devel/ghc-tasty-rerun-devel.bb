SUMMARY = "Haskell tasty-rerun library development files"
DESCRIPTION = "This package provides the Haskell tasty-rerun library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.18"

RPM_NAME = "ghc-tasty-rerun-devel-1.1.18-6.3.aarch64.rpm"
RPM_HASH = "1a32f14d39a35d721d37c7e0b697452d4d8f4e0788a5516426250638ac32f7554aaac1483797f2c1d0740d77d52ea4323b50b43f239087b1ec09c70f96ddf008"

RPROVIDES:${PN} += "ghc-devel-tasty-rerun-1.1.18-CKdldxMcyypFaGJjDtw0uR \
ghc-tasty-rerun-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff \
ghc-devel-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-devel-stm-2.5.1.0 \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-tasty-1.4.3-18zApXOtbThAhmaMCCQRWB \
ghc-devel-transformers-0.5.6.2 \
ghc-tasty-rerun"

inherit rpm
