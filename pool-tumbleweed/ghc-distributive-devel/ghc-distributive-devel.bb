SUMMARY = "Haskell distributive library development files"
DESCRIPTION = "This package provides the Haskell distributive library development files."
LICENSE = "BSD-2-Clause"

PV = "0.6.2.1"

RPM_NAME = "ghc-distributive-devel-0.6.2.1-3.2.aarch64.rpm"
RPM_HASH = "e6d655e4e0e0beddd61d8bcb26cad9f0cf2b79c31eb1b3c2f842f9ab48facf4b930d244250295c6c85e46296a1084753979c37f0cd274f35f6a1eef3fb04ee3a"

RPROVIDES:${PN} += "ghc-devel(distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79) \
ghc-distributive-devel \
ghc-distributive-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8) \
ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-devel(transformers-0.5.6.2) \
ghc-distributive"

inherit rpm
