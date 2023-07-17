SUMMARY = "Qt 6 ShaderTools library - Development files"
DESCRIPTION = "Development files for the Qt 6 ShaderTools library"
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-shadertools-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d37d18eec1ad113e82447fb9872be5f60777928511421b7219cbe7c1b6d41fbf0827598a6e7d163a38d9294bd09798c9c5503d85247cef7118d24bc47e33b966"

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
