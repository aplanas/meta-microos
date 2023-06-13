SUMMARY = "Development files for libfm-qt"
DESCRIPTION = "Libfm-Qt libraries for development"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "libfm-qt-devel-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "9917b3d2d4e34e5951a06d91fd37d64aff838a0a06a4c38bbf8192ab0b9bd3a260383d77d1da6035369ef3b0ccf78f43992fa44c491f7433ff16e2bb116e369e"

RPROVIDES:${PN} += "cmake(fm-qt) \
libfm-qt-devel \
libfm-qt-devel(aarch-64) \
pkgconfig(libfm-qt)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfm-qt13 \
pkgconfig \
pkgconfig(Qt5Widgets) \
pkgconfig(Qt5X11Extras) \
pkgconfig(libmenu-cache)"

inherit rpm
