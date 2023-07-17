SUMMARY = "Qt 6 UiTools library - Development files"
DESCRIPTION = "Development files for the Qt6 UiTools library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-uitools-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "6d98053b046f054dede529bbfe76669a17aef5148eebd147c56eb3542a8e6f22043832f2b57f67b4a9c7c070f692e15234a052b4b0b6e2de484e7bc17a5f079c"

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
