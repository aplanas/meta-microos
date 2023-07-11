SUMMARY = "Haskell tagged library development files"
DESCRIPTION = "This package provides the Haskell tagged library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.7"

RPM_NAME = "ghc-tagged-devel-0.8.7-1.6.aarch64.rpm"
RPM_HASH = "43c4245629710b33a06aa145096da6238a365e77e120c0f30364693ae04a84e70ddba20f29967923e4b2840a4bbd177c87406b2dec2caaafef5c55f4cefa4864"

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
