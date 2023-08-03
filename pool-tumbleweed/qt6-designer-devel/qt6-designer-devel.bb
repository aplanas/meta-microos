SUMMARY = "Qt 6 Designer libraries - Development files"
DESCRIPTION = "Development files for the Qt6 Designer libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-designer-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "db414afc51b462143784f723feb612484d1331c084cdf1af2601ccb4c4efc20df3d1bb9f838d32eff25e8752577cec28e1c09ff459038531e6ca28d8e3f0b2b8"

RPROVIDES:${PN} += "cmake-Qt6Designer \
cmake-Qt6UiPlugin \
pkgconfig-Qt6Designer \
pkgconfig-Qt6UiPlugin \
qt6-designer-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6OpenGLWidgets \
cmake-Qt6Widgets \
cmake-Qt6Xml \
libQt6Designer6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGLWidgets \
pkgconfig-Qt6UiPlugin \
pkgconfig-Qt6Widgets \
pkgconfig-Qt6Xml"

inherit rpm
