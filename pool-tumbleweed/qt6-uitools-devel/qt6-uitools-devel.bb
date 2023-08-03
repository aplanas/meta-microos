SUMMARY = "Qt 6 UiTools library - Development files"
DESCRIPTION = "Development files for the Qt6 UiTools library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-uitools-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3a982832b3d729069934990dd3eeb8597a80135f6d13c237d17310d48d2cd8953147264cdcafe3b235436ac0c49371566522fecc778f4249e4c4dd8c123ed8db"

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
