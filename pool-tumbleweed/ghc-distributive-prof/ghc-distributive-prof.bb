SUMMARY = "Haskell distributive profiling library"
DESCRIPTION = "This package provides the Haskell distributive profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.6.2.1"

RPM_NAME = "ghc-distributive-prof-0.6.2.1-3.2.aarch64.rpm"
RPM_HASH = "beef0cd653cd4da0f6f2c2b27b73289b874cfccf3e919ccf3e7bc6a9a79ab48ff2d76790b9cbad5b079f4d20030bdd161e8a063a2d62761a58f3e1b2966d1ff5"

RPROVIDES:${PN} += "ghc-distributive-prof \
ghc-prof-distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79"

RDEPENDS:${PN} += "ghc-distributive-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-transformers-0.5.6.2"

inherit rpm
