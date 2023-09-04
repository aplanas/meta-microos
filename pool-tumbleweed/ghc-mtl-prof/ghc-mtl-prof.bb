SUMMARY = "Haskell mtl profiling library"
DESCRIPTION = "This package provides the Haskell mtl profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-prof-2.2.2-1.1.aarch64.rpm"
RPM_HASH = "f5e25ea8fcee044b1ab45b6180d81af2985d8549e0e547b61b03f881bdd7410943d6e574244acd4c31b11afd77a06757620d927012c9eb020355a3006e9f75c5"

RPROVIDES:${PN} += "ghc-mtl-prof \
ghc-prof-mtl-2.2.2"

RDEPENDS:${PN} += "ghc-mtl-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
