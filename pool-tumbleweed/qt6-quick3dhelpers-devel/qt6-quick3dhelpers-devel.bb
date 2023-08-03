SUMMARY = "Qt6 Quick3DHelpers library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DHelpers library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dhelpers-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6c57dea6b4baa88da441bb0cb95dcf727048f01a150ed52e8938b697ad802077e4a331aaf62c8db62be6acb13c62913fca8869241690559b58b16580ca236fc7"

RPROVIDES:${PN} += "cmake-Qt6Quick3DHelpers \
pkgconfig-Qt6Quick3DHelpers \
qt6-quick3dhelpers-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6Quick3DHelpers6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D \
qt6-quick3d-private-devel"

inherit rpm
