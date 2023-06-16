SUMMARY = "Haskell tagged library development files"
DESCRIPTION = "This package provides the Haskell tagged library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.7"

RPM_NAME = "ghc-tagged-devel-0.8.7-1.3.aarch64.rpm"
RPM_HASH = "387ac94ca8585dd42386ee5f5c374d1f0e2d0492bc5224392e4683dd44773dc20f1c0c8bb805d2d8501981d350a83d763433dcd94dc438226d05a8faca0f7c58"

RPROVIDES:${PN} += "ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-tagged-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-tagged"

inherit rpm
