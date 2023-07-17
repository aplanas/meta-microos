SUMMARY = "Qt 6 3D development meta package"
DESCRIPTION = "This meta-package requires all the qt6-3d development packages."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3d-devel-6.5.1-2.1.noarch.rpm"
RPM_HASH = "853d542f106b2a74672ec58d46542acd958b4ed7ad6a88ae231f49d712a18cb93af4c30ebb12cc4b028f8b82ad1b2e887583b109cfb3632fd04b412defaada65"
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
