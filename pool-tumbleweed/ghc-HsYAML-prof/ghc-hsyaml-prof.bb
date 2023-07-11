SUMMARY = "Haskell HsYAML profiling library"
DESCRIPTION = "This package provides the Haskell HsYAML profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-prof-0.2.1.1-3.6.aarch64.rpm"
RPM_HASH = "c30d17659a269de6c3df0c5c6a6fcdd3d5d2918eccefec24552ffa3de794602b2042230de8e2f1c040be2ff8c5bd6aba6919a82c610930f33e14bf8633e4bc6a"

RPROVIDES:${PN} += "ghc-HsYAML-prof \
ghc-prof-HsYAML-0.2.1.1-KzoQvRN4UKW2jR1yND83sf"

RDEPENDS:${PN} += "ghc-HsYAML-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
