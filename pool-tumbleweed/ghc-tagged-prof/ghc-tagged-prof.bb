SUMMARY = "Haskell tagged profiling library"
DESCRIPTION = "This package provides the Haskell tagged profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.7"

RPM_NAME = "ghc-tagged-prof-0.8.7-1.6.aarch64.rpm"
RPM_HASH = "0d90083b047c6c0f9dd31e7f6a838665e016a37ddd3b2df9b03131f2a12c374f9c36add6a049fbdae33306519f480c2a8058458fa06756b50975e125b0d59201"

RPROVIDES:${PN} += "ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-tagged-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2 \
ghc-tagged-devel"

inherit rpm
