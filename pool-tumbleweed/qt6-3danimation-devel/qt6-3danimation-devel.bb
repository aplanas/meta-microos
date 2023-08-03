SUMMARY = "Development files for the Qt 6 3DAnimation library"
DESCRIPTION = "Development files for the Qt 6 3DAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3danimation-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e105a90fbf49eb674cecc86412010393696e579a4fb5b4c37c24b99efdf3e021faa12aba94774cd2a74206c077c106acf624ebb7e9a3f712d1f432da319dba75"

RPROVIDES:${PN} += "cmake-Qt63DAnimation \
pkgconfig-Qt63DAnimation \
qt6-3danimation-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DRender \
cmake-Qt6Gui \
libQt63DAnimation6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
