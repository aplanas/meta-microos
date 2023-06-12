SUMMARY = "Development files for the Qt 6 3DCore library"
DESCRIPTION = "Development files for the Qt 6 3DCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dcore-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "67d7b8cec2a849de782dd1d439df097937b07b4636e94f0d91324eb5f21b25fa2db7ec1d2ba417d94361648cb9310c8fa9323478b0290fb38d87f9782ea56801"

RPROVIDES:${PN} += "cmake(Qt63DCore) \
pkgconfig(Qt63DCore) \
qt6-3dcore-devel \
qt6-3dcore-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Concurrent) \
cmake(Qt6Gui) \
cmake(Qt6Network) \
libQt63DCore6 \
pkgconfig(Qt6Concurrent) \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Network)"

inherit rpm
