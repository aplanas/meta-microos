SUMMARY = "Development files for the Qt 6 GUI libraries"
DESCRIPTION = "Development files for the Qt 6 GUI libraries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-gui-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "13ffc960bd29ad757121144980319981353923910aebfb6a2a033c3c18ff0f98af5a4bb89287e13e2aa8e407d1692d1a987cddf87917ed3a668bb779b60ba4e8"

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
