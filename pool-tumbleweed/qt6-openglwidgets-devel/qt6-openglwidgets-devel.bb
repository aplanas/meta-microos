SUMMARY = "Development files for the Qt 6 OpenGLWidgets library"
DESCRIPTION = "Development files for the Qt 6 OpenGLWidgets library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-openglwidgets-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "330e7e65a2c43f14bb2eb9160c3321300a1667e92b958d1f5727b6ce4d26774685364b801fe8036c480fc6bac5ff22cb4d164cca3dd4f2af1f585bcbad194413"

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
