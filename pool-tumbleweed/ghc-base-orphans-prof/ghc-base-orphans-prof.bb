SUMMARY = "Haskell base-orphans profiling library"
DESCRIPTION = "This package provides the Haskell base-orphans profiling library."
LICENSE = "MIT"

PV = "0.8.8.2"

RPM_NAME = "ghc-base-orphans-prof-0.8.8.2-1.3.aarch64.rpm"
RPM_HASH = "ad565226575a2e23259e6b1a0de18fc5236bf2c3eba717ce42c655345548c4d4bd7f598bbabe5b8d884ad2aee90562e4bbe33030515d963a26d9c51b60b92ace"

RPROVIDES:${PN} += "ghc-base-orphans-prof \
ghc-prof-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5"

RDEPENDS:${PN} += "ghc-base-orphans-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-ghc-prim-0.9.1"

inherit rpm
