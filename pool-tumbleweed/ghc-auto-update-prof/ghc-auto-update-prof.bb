SUMMARY = "Haskell auto-update profiling library"
DESCRIPTION = "This package provides the Haskell auto-update profiling library."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ghc-auto-update-prof-0.1.6-6.6.aarch64.rpm"
RPM_HASH = "553e8c1cbb3d5bef43aed3c083bfe79a5d93932ca2f9cd9966f7edd5cbf677a42ce20eaa827a58de1ae2a839bc4c5de74574f42af843f34f8ab3cd4972e11347"

RPROVIDES:${PN} += "ghc-auto-update-prof \
ghc-prof-auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ"

RDEPENDS:${PN} += "ghc-auto-update-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
