SUMMARY = "Haskell mountpoints library development files"
DESCRIPTION = "This package provides the Haskell mountpoints library development files."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-devel-1.0.2-4.4.aarch64.rpm"
RPM_HASH = "abc456692457d59648ecbaf8edc9016ed84b7f0f6dae93239b6a97eb5ada9a3c429684041322feef411096c428b95a39c19dea79cd86e412c62e23173132b4e2"

RPROVIDES:${PN} += "ghc-devel-mountpoints-1.0.2-6LGBE5yGg5t52Lw1dci4Pp \
ghc-mountpoints-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-mountpoints"

inherit rpm
