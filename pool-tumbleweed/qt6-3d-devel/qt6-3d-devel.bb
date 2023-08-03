SUMMARY = "Qt 6 3D development meta package"
DESCRIPTION = "This meta-package requires all the qt6-3d development packages."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3d-devel-6.5.2-1.1.noarch.rpm"
RPM_HASH = "19ed4225da0dfe726684ffd8e4203b8ece3bfbaf10365d8cc563067a60d6941a8c7da9da42f3674fbe7728d81449ffdedf92224718a5ca976a91e5c83cd1b8b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-3d-devel"

RDEPENDS:${PN} += "cmake-Qt63DAnimation \
cmake-Qt63DCore \
cmake-Qt63DExtras \
cmake-Qt63DInput \
cmake-Qt63DLogic \
cmake-Qt63DQuick \
cmake-Qt63DQuickAnimation \
cmake-Qt63DQuickExtras \
cmake-Qt63DQuickInput \
cmake-Qt63DQuickRender \
cmake-Qt63DQuickScene2D \
cmake-Qt63DRender"

inherit rpm
