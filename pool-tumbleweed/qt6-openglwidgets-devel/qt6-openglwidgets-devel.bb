SUMMARY = "Development files for the Qt 6 OpenGLWidgets library"
DESCRIPTION = "Development files for the Qt 6 OpenGLWidgets library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-openglwidgets-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "ed6672c0d14be89338a464e90f35fc6d08e7432b692634f609515bf84fe0eac016eacf5270888ad25041d8774853454c97229aad165929df61b2f84e03995848"

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
