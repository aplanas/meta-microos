SUMMARY = "Haskell ordered-containers profiling library"
DESCRIPTION = "This package provides the Haskell ordered-containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-ordered-containers-prof-0.2.3-1.3.aarch64.rpm"
RPM_HASH = "72e5e5fb174b899bed74aa1b3da1f26972c049d45ca7c1298eb6ef7576e3dc3bcde7e076b399e6ea31cf160647b8dabeff8f3d89e4a9c6bec2ccb203d2bccf28"

RPROVIDES:${PN} += "ghc-ordered-containers-prof \
ghc-prof-ordered-containers-0.2.3-2vvzHwtaKIjK7BBzxceSWT"

RDEPENDS:${PN} += "ghc-ordered-containers-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7"

inherit rpm
