SUMMARY = "Qt 6 UiTools library - Development files"
DESCRIPTION = "Development files for the Qt6 UiTools library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-uitools-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "af543309c8d8575e40ab056e966072291a3a6d18d80ed8e65f3544b2d5b664fa58166cdacfa7e6c83856261704cf6fa78271125b70375d7a7e62c9b7b5058c08"

RPROVIDES:${PN} += "cmake-Qt6UiTools \
pkgconfig-Qt6UiTools \
qt6-uitools-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6OpenGLWidgets \
cmake-Qt6UiPlugin \
cmake-Qt6Widgets \
libQt6UiTools6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGLWidgets \
pkgconfig-Qt6Widgets"

inherit rpm
