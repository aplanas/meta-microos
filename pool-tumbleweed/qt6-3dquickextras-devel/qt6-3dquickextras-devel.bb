SUMMARY = "Development files for the Qt 6 3DQuickExtras library"
DESCRIPTION = "Development files for the Qt 6 3DQuickExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickextras-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "d542d81b09410684c2a5dc786e0eeae28777636a69e4d0ada766cd05fd1d8759809a6c6bb30c23b2adea3b26738c53bb8a560d779b6c1f5b68341f643d82a4c9"

RPROVIDES:${PN} += "cmake(Qt63DQuickExtras) \
pkgconfig(Qt63DQuickExtras) \
qt6-3dquickextras-devel \
qt6-3dquickextras-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt63DCore) \
cmake(Qt63DExtras) \
cmake(Qt63DInput) \
cmake(Qt63DQuick) \
cmake(Qt63DRender) \
cmake(Qt6Gui) \
cmake(Qt6Qml) \
libQt63DQuickExtras6 \
pkgconfig(Qt63DCore) \
pkgconfig(Qt63DExtras) \
pkgconfig(Qt63DInput) \
pkgconfig(Qt63DQuick) \
pkgconfig(Qt63DRender) \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Qml)"

inherit rpm
