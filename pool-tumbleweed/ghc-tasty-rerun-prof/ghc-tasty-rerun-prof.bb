SUMMARY = "Haskell tasty-rerun profiling library"
DESCRIPTION = "This package provides the Haskell tasty-rerun profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.18"

RPM_NAME = "ghc-tasty-rerun-prof-1.1.18-6.3.aarch64.rpm"
RPM_HASH = "3592b61e84cf5cc9aa4cb8a829da629b956fde642a1650e1de17b806f1e499242af7dd4e7152c68f46088448ee6ce76d51596bc5f5d490bb8a26f313b6938ebe"

RPROVIDES:${PN} += "ghc-prof-tasty-rerun-1.1.18-CKdldxMcyypFaGJjDtw0uR \
ghc-tasty-rerun-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff \
ghc-prof-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-prof-stm-2.5.1.0 \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-tasty-1.4.3-18zApXOtbThAhmaMCCQRWB \
ghc-prof-transformers-0.5.6.2 \
ghc-tasty-rerun-devel"

inherit rpm
