SUMMARY = "Qt6 Quick3DRuntimeRender library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DRuntimeRender library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3druntimerender-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "9979729f8ec9f57c87bb034c349bda1bca841db3d3dce2fb2d3a40ea26bff017944757fc0ee09a7fff23537f066242cd7660889fd5b73908f70973ed6d9563b5"

RPROVIDES:${PN} += "cmake-Qt6Quick3DRuntimeRender \
pkgconfig-Qt6Quick3DRuntimeRender \
qt6-quick3druntimerender-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Concurrent \
cmake-Qt6Gui \
cmake-Qt6Quick \
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
