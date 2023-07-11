SUMMARY = "Haskell haddock-library profiling library"
DESCRIPTION = "This package provides the Haskell haddock-library profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-prof-1.11.0-2.6.aarch64.rpm"
RPM_HASH = "0558718fd2daa6fd37c55649746d574ae3206dede6c09a9b33bad8dc84c59d22680bfc46b67677f61cc556559fc5978ab5401acb3b2746e38f23fa1fd942eaef"

RPROVIDES:${PN} += "ghc-haddock-library-prof \
ghc-prof-haddock-library-1.11.0-3IU1wl1Mct8946s210c9Hs"

RDEPENDS:${PN} += "ghc-haddock-library-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2"

inherit rpm
