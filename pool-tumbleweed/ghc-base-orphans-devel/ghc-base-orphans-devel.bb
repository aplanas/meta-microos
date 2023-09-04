SUMMARY = "Haskell base-orphans library development files"
DESCRIPTION = "This package provides the Haskell base-orphans library development files."
LICENSE = "MIT"

PV = "0.8.8.2"

RPM_NAME = "ghc-base-orphans-devel-0.8.8.2-1.3.aarch64.rpm"
RPM_HASH = "92a6bbea69698d8106298076eb1d985d19ed5385683105dcd72eb9ad2d6a42263b93f078cb01de9783cb7c6a418ec56fefa5aca62ca5f049530618492b4c9081"

RPROVIDES:${PN} += "ghc-base-orphans-devel \
ghc-devel-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base-orphans \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-ghc-prim-0.9.1"

inherit rpm
