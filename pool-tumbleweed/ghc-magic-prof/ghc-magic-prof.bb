SUMMARY = "Haskell magic profiling library"
DESCRIPTION = "This package provides the Haskell magic profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-magic-prof-1.1-4.8.aarch64.rpm"
RPM_HASH = "d9f17d01228ef0466f42a563586b5bbd5b3e39012f240874b3861a80942c3b9276f41cacbd4cc0e5383f785da6d82102020c41115f0a569e179c650fab987b8e"

RPROVIDES:${PN} += "ghc-magic-prof \
ghc-prof-magic-1.1-I7L3tCx2kmTIw2Fco7m622"

RDEPENDS:${PN} += "ghc-magic-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
