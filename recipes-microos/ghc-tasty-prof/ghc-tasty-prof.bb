SUMMARY = "Haskell tasty profiling library"
DESCRIPTION = "This package provides the Haskell tasty profiling library."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "ghc-tasty-prof-1.4.3-1.3.aarch64.rpm"
RPM_HASH = "7859a7ca7bc99ffd4f43b745d31c925080dc54b93372ed6c061166675f00451707ec32664f42a0a3af281037126f86490508146fef586cf5900ac37da2c224d4"

RPROVIDES:${PN} += "ghc-prof(tasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz) ghc-tasty-prof ghc-tasty-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(optparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB) ghc-prof(stm-2.5.1.0) ghc-prof(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) ghc-prof(transformers-0.5.6.2) ghc-prof(unix-2.7.3) ghc-tasty-devel"

inherit rpm
