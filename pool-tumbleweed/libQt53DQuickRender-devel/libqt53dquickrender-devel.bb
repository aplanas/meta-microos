SUMMARY = "Development files for the Qt 5 QuickRenderer 3D library"
DESCRIPTION = "Development files for the Qt 5 QuickRenderer 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DQuickRender-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "986fc4d0fc18928363c8339a5cc8b58606ce77cc79d12d08b52c5f34ed3d05b16fdc6bd1babd83bd3596c52a238ca59a6781ef40191ff5a677c4e223068ddf6d"

RPROVIDES:${PN} += "cmake-Qt53DQuickRender \
libQt53DQuickRender-devel \
libQt53DQuickRenderer-devel \
pkgconfig-Qt53DQuickRender"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickRender5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DQuick \
pkgconfig-Qt53DRender \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml"

inherit rpm
