SUMMARY = "Haskell tasty library development files"
DESCRIPTION = "This package provides the Haskell tasty library development files."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "ghc-tasty-devel-1.4.3-1.7.aarch64.rpm"
RPM_HASH = "20842e3295cb5ff7d3ecfab72ba5ec764a29626d867cb67b1beafee247a26bf83e16100096dc2a7baa78e894d8e5c497a8ddeb7c0777fb9db90021aef4480ce1"

RPROVIDES:${PN} += "ghc-devel-tasty-1.4.3-18zApXOtbThAhmaMCCQRWB \
ghc-tasty-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff \
ghc-devel-stm-2.5.1.0 \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-tasty"

inherit rpm
