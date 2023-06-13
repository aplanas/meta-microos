SUMMARY = "Development files for the Qt 5 QuickRenderer 3D library"
DESCRIPTION = "Development files for the Qt 5 QuickRenderer 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DQuickRender-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "5fbdb7d5f311535f32d3ffc318598c21cedd39e18c08e17a5cca3d901981bcf1c9644fb35e55ea8cb573a6ad1658b62e906f0b590aaa3a76bbcc7a7057ee1f32"

RPROVIDES:${PN} += "cmake(Qt53DQuickRender) \
libQt53DQuickRender-devel \
libQt53DQuickRender-devel(aarch-64) \
libQt53DQuickRenderer-devel \
pkgconfig(Qt53DQuickRender)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickRender5 \
pkgconfig(Qt53DCore) \
pkgconfig(Qt53DQuick) \
pkgconfig(Qt53DRender) \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui) \
pkgconfig(Qt5Qml)"

inherit rpm
