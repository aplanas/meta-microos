SUMMARY = "Development files for the Qt 6 3DRender library"
DESCRIPTION = "Development files for the Qt 6 3DRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3drender-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c24e800cec06a53272d06309f555933055dde568e23cbb08d510aacd896bf342636fd8905c336d889d2c01146162274870c278486ae064eb6c58f500cb681e27"

RPROVIDES:${PN} += "cmake(Qt63DRender) \
pkgconfig(Qt63DRender) \
qt6-3drender-devel \
qt6-3drender-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt63DCore) \
cmake(Qt6Concurrent) \
cmake(Qt6OpenGL) \
libQt63DRender6 \
pkgconfig(Qt63DCore) \
pkgconfig(Qt6Core) \
pkgconfig(Qt6OpenGL)"

inherit rpm
