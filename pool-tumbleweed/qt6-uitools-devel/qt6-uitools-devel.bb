SUMMARY = "Qt 6 UiTools library - Development files"
DESCRIPTION = "Development files for the Qt6 UiTools library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-uitools-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b509196eafb77ed1cd75c024199fb015b92e176d868cb81ebd5dbc997e6caef7e47c9b35ef8b4ada55d217486bb6fd72076fe5558db6e115800a602a0840cc1c"

RPROVIDES:${PN} += "cmake(Qt6UiTools) \
pkgconfig(Qt6UiTools) \
qt6-uitools-devel \
qt6-uitools-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
cmake(Qt6OpenGL) \
cmake(Qt6OpenGLWidgets) \
cmake(Qt6UiPlugin) \
cmake(Qt6Widgets) \
libQt6UiTools6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6OpenGLWidgets) \
pkgconfig(Qt6Widgets)"

inherit rpm
