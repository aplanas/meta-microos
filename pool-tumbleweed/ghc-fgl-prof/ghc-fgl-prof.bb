SUMMARY = "Haskell fgl profiling library"
DESCRIPTION = "This package provides the Haskell fgl profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.8.0.0"

RPM_NAME = "ghc-fgl-prof-5.8.0.0-3.2.aarch64.rpm"
RPM_HASH = "b6df0abd8a1c225276c2ab7b0f6177a5352ddc28721480c53c96e348bbbb4f466cb9c8550368b0da75a1647b8ba1612b7c19b31ec73310de46cbd940b60e3fbe"

RPROVIDES:${PN} += "ghc-fgl-prof \
ghc-prof-fgl-5.8.0.0-1euDADByC3LGFbnFGelVpn"

RDEPENDS:${PN} += "ghc-fgl-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
