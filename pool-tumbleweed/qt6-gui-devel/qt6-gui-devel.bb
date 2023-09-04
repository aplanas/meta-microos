SUMMARY = "Development files for the Qt 6 GUI libraries"
DESCRIPTION = "Development files for the Qt 6 GUI libraries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-gui-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "2321a676033ee58d0fc91e0206313877ea549b2cc5754440d0ccb221e1c18219d1e8a4c668502484bab9b29e8ef57f73ad5f8e58ab31015d04954553968016be"

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
