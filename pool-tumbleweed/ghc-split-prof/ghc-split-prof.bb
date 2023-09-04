SUMMARY = "Haskell split profiling library"
DESCRIPTION = "This package provides the Haskell split profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-split-prof-0.2.3.5-2.3.aarch64.rpm"
RPM_HASH = "685707b04cc60297e95c45417c56cf95f8d7145b9a7793d6ac3179933a0e969b7cd54bffae973af95448a5b548affae7e535dbd494f97c93afff0b2b93e4d4e8"

RPROVIDES:${PN} += "ghc-prof-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-split-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-split-devel"

inherit rpm
