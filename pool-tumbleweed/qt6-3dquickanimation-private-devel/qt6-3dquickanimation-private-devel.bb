SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickAnimation library"
DESCRIPTION = "This package provides private headers of libQt63DQuickAnimation that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dquickanimation-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "41a2b0737b7d4e2a5ba003f22c819e84da747c6adb6c3391109f5a32720e2c5dd0ccc5de8fe27c85fba3076abe74d124fff9ec594ab8dc84cad8db36d4e4fb36"

RPROVIDES:${PN} += "qt6-3dquickanimation-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuickAnimation \
qt6-3dcore-private-devel \
qt6-3dquick-private-devel \
qt6-3drender-private-devel \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
