SUMMARY = "Development files for the Qt 6 GUI libraries"
DESCRIPTION = "Development files for the Qt 6 GUI libraries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-gui-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "015f3c1f0c3f402cc6a65cf9991e34ab6929e0fcda4b1141aaa64d828bd1a12608feca1b20597982d4932f4b459b332fb0718f70f10af1aa58a8d0b0c2695062"

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
