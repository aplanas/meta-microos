SUMMARY = "Development files for the Qt 6 GUI libraries"
DESCRIPTION = "Development files for the Qt 6 GUI libraries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-gui-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "9d55c1571c480b0338413c5314f6cc2ad548d67ac00f0c388aa5440c3aad38e6b386c30ff6f1708865f02e18f510dee985052d8689306d14b274f5dcab13e179"

RPROVIDES:${PN} += "cmake-Qt6Gui \
cmake-Qt6GuiTools \
pkgconfig-Qt6Gui \
qt6-gui-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libGLESv3-devel \
cmake-Qt6Core \
cmake-Qt6DBus \
libQt6Gui6 \
pkgconfig-Qt6Core \
pkgconfig-atspi-2 \
pkgconfig-egl \
pkgconfig-gbm \
pkgconfig-glesv2 \
pkgconfig-libdrm \
pkgconfig-vulkan \
pkgconfig-xkbcommon"

inherit rpm
