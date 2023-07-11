SUMMARY = "Qt6 Quick3DRuntimeRender library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DRuntimeRender library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3druntimerender-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "790619717473c8689928f605d8c636f7564aeb996322ef46ec3c71a4b38a7e2297e72590b7cf971f153922e21a424a83162aa21115aa42a4734b08d2db65a254"

RPROVIDES:${PN} += "cmake-Qt6Quick3DRuntimeRender \
pkgconfig-Qt6Quick3DRuntimeRender \
qt6-quick3druntimerender-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Quick3DUtils \
cmake-Qt6ShaderTools \
libQt6Quick3DRuntimeRender6 \
pkgconfig-Qt6Concurrent \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3DUtils \
pkgconfig-Qt6ShaderTools"

inherit rpm
