SUMMARY = "Haskell optics-core library development files"
DESCRIPTION = "This package provides the Haskell optics-core library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-optics-core-devel-0.4.1.1-1.4.aarch64.rpm"
RPM_HASH = "be725558a8c7def2154c3a6d761cfde47195f3807a579c4eda9b9012b05ffdba0df8a6dcfd9cbaa286887b151f3a8804871058f1aa3523fb9187205ff5553013"

RPROVIDES:${PN} += "ghc-devel-optics-core-0.4.1.1-GFxq3hBCaeZX1WvuRPRZs \
ghc-optics-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-indexed-profunctors-0.1.1.1-8VFnw8ahpDVCAreg6vEIe9 \
ghc-devel-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-devel-transformers-0.5.6.2 \
ghc-optics-core"

inherit rpm
