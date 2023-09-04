SUMMARY = "Haskell monad-loops profiling library"
DESCRIPTION = "This package provides the Haskell monad-loops profiling library."
LICENSE = "SUSE-Public-Domain"

PV = "0.4.3"

RPM_NAME = "ghc-monad-loops-prof-0.4.3-11.3.aarch64.rpm"
RPM_HASH = "2eec22b74b2d2b0c2f2bcb6b574fd4a5f42dcf50a4609e3789af1a831f728c6cb6b754d597e1359a416a9359d557d2b09d6854e8c90034f9a4479d187821af71"

RPROVIDES:${PN} += "ghc-monad-loops-prof \
ghc-prof-monad-loops-0.4.3-Hqvq9oJQAvl8Gm82ocTn8i"

RDEPENDS:${PN} += "ghc-monad-loops-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
