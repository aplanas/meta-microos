SUMMARY = "Qt 6 ShaderTools library - Development files"
DESCRIPTION = "Development files for the Qt 6 ShaderTools library"
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-shadertools-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "87d9b88f3395135edb67bc693bedc3463ab4fedd422f954a883e048bf994fc5c9fee29f99b155355ac493722d7bc9068501833a84c514cfd7046225685a58962"

RPROVIDES:${PN} += "cmake-Qt6ShaderTools \
cmake-Qt6ShaderToolsTools \
pkgconfig-Qt6ShaderTools \
qt6-shadertools-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6ShaderTools6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
qt6-shadertools"

inherit rpm
