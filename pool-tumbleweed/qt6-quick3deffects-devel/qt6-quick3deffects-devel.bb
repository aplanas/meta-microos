SUMMARY = "Qt6 Quick3DEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3deffects-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "89d3cd71de560aa4f10de5ade95e96511105dd9f827b72ac34fe866b8e06933e5430707a6f9e2574fde32426a63f7bee0254453f16ae1714338084aebdb4edba"

RPROVIDES:${PN} += "cmake-Qt6Quick3DEffects \
pkgconfig-Qt6Quick3DEffects \
qt6-quick3deffects-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
libQt6Quick3DEffects6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D \
qt6-quick3d-private-devel"

inherit rpm
