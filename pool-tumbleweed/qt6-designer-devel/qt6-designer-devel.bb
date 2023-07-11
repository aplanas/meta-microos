SUMMARY = "Qt 6 Designer libraries - Development files"
DESCRIPTION = "Development files for the Qt6 Designer libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-designer-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d910b379c264e55d9788158fbe5ab4fa776d7cc6dad66c72395c744b0bb5dba256a833c4812c7423524e2987effe746d291757e18a3fb9b656d8aa41eb944d52"

RPROVIDES:${PN} += "cmake-Qt6Designer \
cmake-Qt6UiPlugin \
pkgconfig-Qt6Designer \
pkgconfig-Qt6UiPlugin \
qt6-designer-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
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
