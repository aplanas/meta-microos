SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickScene2D library"
DESCRIPTION = "This package provides private headers of libQt63DQuickScene2D that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickscene2d-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f6d2cf086561d9d29d6095e4862c656db65aa348b4bb830199e4b1341a4164ba63f00a457f6fda9455d19a60341433c121cfbe542bf3e82f752915dd79f53a02"

RPROVIDES:${PN} += "qt6-3dquickscene2d-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuickScene2D \
qt6-3dcore-private-devel \
qt6-3dquick-private-devel \
qt6-3drender-private-devel \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
