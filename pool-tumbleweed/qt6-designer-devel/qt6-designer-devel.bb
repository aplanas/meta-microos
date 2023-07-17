SUMMARY = "Qt 6 Designer libraries - Development files"
DESCRIPTION = "Development files for the Qt6 Designer libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-designer-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "d446577ea89e4f6343512574ce002cfd8965e08484bcf10a749d88c88e4932913004b4fba68226440e418267f76c8e0e54a13579ab2297b89977f7d98e869f8c"

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
