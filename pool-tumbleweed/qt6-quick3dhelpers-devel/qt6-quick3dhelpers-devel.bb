SUMMARY = "Qt6 Quick3DHelpers library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DHelpers library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dhelpers-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f6e1891c958ede8bb19acab56c449c74e0d79181ec2f31f3ebe0a1401beda146bb464075baec65260bfd9635974be481cef894a7ae0a4553eb46938e3576592f"

RPROVIDES:${PN} += "cmake(Qt6Quick3DHelpers) \
pkgconfig(Qt6Quick3DHelpers) \
qt6-quick3dhelpers-devel \
qt6-quick3dhelpers-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Qml) \
libQt6Quick3DHelpers6 \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Quick) \
pkgconfig(Qt6Quick3D) \
qt6-quick3d-private-devel"

inherit rpm
