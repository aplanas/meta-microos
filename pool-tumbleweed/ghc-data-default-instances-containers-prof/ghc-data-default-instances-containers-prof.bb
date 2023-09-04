SUMMARY = "Haskell data-default-instances-containers profiling library"
DESCRIPTION = "This package provides the Haskell data-default-instances-containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-containers-prof-0.0.1-11.3.aarch64.rpm"
RPM_HASH = "fc8f39db94c24f2255fa08ac37f0824600ef7db65467060554ab6d1f3e61f941e8e6f0bf35089637930d0894579b9a27a4d13f50bf22690cd0a09fcfe193f0a3"

RPROVIDES:${PN} += "ghc-data-default-instances-containers-prof \
ghc-prof-data-default-instances-containers-0.0.1-HEdLgVFxVe7RkY046PWd1"

RDEPENDS:${PN} += "ghc-data-default-instances-containers-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN"

inherit rpm
