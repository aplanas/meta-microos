SUMMARY = "Development files for the Qt 6 GUI libraries"
DESCRIPTION = "Development files for the Qt 6 GUI libraries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-gui-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "030c3fc16bee51f8a4dcc824be0c7c76a9692b201eda7ed37255c74c805b1500c3b580252bbfd379c4a8198507889ed6b07317bd4f0162d236041a7431b622f1"

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
