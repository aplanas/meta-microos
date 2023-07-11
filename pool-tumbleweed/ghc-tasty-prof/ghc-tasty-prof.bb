SUMMARY = "Haskell tasty profiling library"
DESCRIPTION = "This package provides the Haskell tasty profiling library."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "ghc-tasty-prof-1.4.3-1.7.aarch64.rpm"
RPM_HASH = "34da2ab11dfae025c319f3046c041cab68657c4b05d835787d91ff112078a64c47030597e2962a36552950b2d272be6448f3635c000803a8c2c20cab263d35a7"

RPROVIDES:${PN} += "ghc-prof-tasty-1.4.3-18zApXOtbThAhmaMCCQRWB \
ghc-tasty-prof"

RDEPENDS:${PN} += "ghc-prof-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff \
ghc-prof-stm-2.5.1.0 \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-tasty-devel"

inherit rpm
