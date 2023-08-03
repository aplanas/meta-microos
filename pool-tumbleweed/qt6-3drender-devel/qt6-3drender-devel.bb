SUMMARY = "Development files for the Qt 6 3DRender library"
DESCRIPTION = "Development files for the Qt 6 3DRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3drender-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b0eddcb23fb22f3f646c426a99b9481586bb9bace55b963f7672266df2b58ac36d588241abd5507faad5982340e5df9f01f53b302584fe3340d1a27e8e97980c"

RPROVIDES:${PN} += "cmake-Qt63DRender \
pkgconfig-Qt63DRender \
qt6-3drender-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt6Concurrent \
cmake-Qt6OpenGL \
libQt63DRender6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6OpenGL"

inherit rpm
