SUMMARY = "Development files for the Qt 6 3DQuickRender library"
DESCRIPTION = "Development files for the Qt 6 3DQuickRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickrender-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "74b30763280280e5a8d6f0aa07caacd55d0c2a81afcd8ed607799b994031392d5abecbfdb4f173c91345a926ec10793dc43f8bf4d51a0b55cd712676f1afe1bf"

RPROVIDES:${PN} += "cmake(Qt63DQuickRender) \
pkgconfig(Qt63DQuickRender) \
qt6-3dquickrender-devel \
qt6-3dquickrender-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt63DCore) \
cmake(Qt63DQuick) \
cmake(Qt63DRender) \
cmake(Qt6Gui) \
cmake(Qt6Qml) \
libQt63DQuickRender6 \
pkgconfig(Qt63DCore) \
pkgconfig(Qt63DQuick) \
pkgconfig(Qt63DRender) \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Qml)"

inherit rpm
