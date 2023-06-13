SUMMARY = "Development files for the Qt 6 3DQuickScene2D library"
DESCRIPTION = "Development files for the Qt 6 3DQuickScene2D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickscene2d-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dcdf6867f04d06e46fad0420f772f069bc218f71041ffd426e8f2126a076c70738e4a09eec52c82e28496ca3ea551a03a70c3c145e4692aeca217fc1e574bcaa"

RPROVIDES:${PN} += "cmake(Qt63DQuickScene2D) \
pkgconfig(Qt63DQuickScene2D) \
qt6-3dquickscene2d-devel \
qt6-3dquickscene2d-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt63DCore) \
cmake(Qt63DQuick) \
cmake(Qt63DRender) \
cmake(Qt6Gui) \
cmake(Qt6Qml) \
libQt63DQuickScene2D6 \
pkgconfig(Qt63DCore) \
pkgconfig(Qt63DQuick) \
pkgconfig(Qt63DRender) \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Qml)"

inherit rpm
