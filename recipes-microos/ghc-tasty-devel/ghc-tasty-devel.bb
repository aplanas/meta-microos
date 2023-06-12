SUMMARY = "Haskell tasty library development files"
DESCRIPTION = "This package provides the Haskell tasty library development files."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "ghc-tasty-devel-1.4.3-1.3.aarch64.rpm"
RPM_HASH = "10c2c7ce3bd89b669ca6951e18b977e7fbe405d6a47a5a94ee8f640bb9a0820346245849ea7e8d527502ec20178f23484d2eb2948d5b9e9bc5476993f880001a"

RPROVIDES:${PN} += "ghc-devel(tasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz) \
ghc-tasty-devel \
ghc-tasty-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(optparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB) \
ghc-devel(stm-2.5.1.0) \
ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unix-2.7.3) \
ghc-tasty"

inherit rpm
