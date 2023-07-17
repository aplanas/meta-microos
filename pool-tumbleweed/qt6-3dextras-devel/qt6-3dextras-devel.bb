SUMMARY = "Development files for the Qt 6 3DExtras library"
DESCRIPTION = "Development files for the Qt 6 3DExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dextras-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "dfd63482c07cdf4dfa8896f095dbed1a3a40668177aac362968fdd6bdc11f4f63cd19612c611e7893b300387110ea2fbaa296c60a3ad55b9b6c2192980582eac"

RPROVIDES:${PN} += "cmake-Qt63DExtras \
pkgconfig-Qt63DExtras \
qt6-3dextras-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DInput \
cmake-Qt63DLogic \
cmake-Qt63DRender \
cmake-Qt6Gui \
libQt63DExtras6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DInput \
pkgconfig-Qt63DLogic \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
