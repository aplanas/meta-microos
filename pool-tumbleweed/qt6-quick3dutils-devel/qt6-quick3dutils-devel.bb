SUMMARY = "Qt6 Quick3DUtils library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dutils-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "df8db2319a088a9a632e88d646a4e1b14299a2d282f7953a73b6bc0bdc4dc30fdcaa6c140ebc7eb36c34164ab95f770878f3f89a379ab1f147bdf8eed784d57a"

RPROVIDES:${PN} += "cmake(Qt6Quick3DUtils) \
pkgconfig(Qt6Quick3DUtils) \
qt6-quick3dutils-devel \
qt6-quick3dutils-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
libQt6Quick3DUtils6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
qt6-quick-private-devel"

inherit rpm
