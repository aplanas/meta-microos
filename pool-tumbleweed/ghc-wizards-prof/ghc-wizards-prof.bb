SUMMARY = "Haskell wizards profiling library"
DESCRIPTION = "This package provides the Haskell wizards profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-prof-1.0.3-6.5.aarch64.rpm"
RPM_HASH = "f2a9904d835674c759d3f0b9c38b97f899641e732d95d1a58be277d68ae66ec0740f8449fd807892598d1975e4e83e0bcec4f7b639e95df2b8bdf7c0dcbbc337"

RPROVIDES:${PN} += "ghc-prof-wizards-1.0.3-4dF6xVc0i30CRerGIMRP2J \
ghc-wizards-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-control-monad-free-0.6.2-14mRW5Z3hOW3y0QtFAGsp6 \
ghc-prof-haskeline-0.8.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-wizards-devel"

inherit rpm
