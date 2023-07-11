SUMMARY = "Development files for the Qt 6 OpenGLWidgets library"
DESCRIPTION = "Development files for the Qt 6 OpenGLWidgets library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-openglwidgets-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "52603dd1bf256acf3e705dbb947c66fc1f611ab9c132145a9fe833a3169b52712d67fc1a43d11ed94dfbe42cef58c99d21015fbf953b9e25561710a426fda2be"

RPROVIDES:${PN} += "cmake-Qt6OpenGLWidgets \
pkgconfig-Qt6OpenGLWidgets \
qt6-openglwidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libGLESv3-devel \
cmake-Qt6OpenGL \
cmake-Qt6Widgets \
libQt6OpenGLWidgets6 \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6Widgets \
pkgconfig-glesv2"

inherit rpm
