SUMMARY = "Development package for libdbusmenu-qt5"
DESCRIPTION = "This package contains development files for libdbusmenu-qt5."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.3+16.04.20160218"

RPM_NAME = "libdbusmenu-qt5-devel-0.9.3+16.04.20160218-1.13.aarch64.rpm"
RPM_HASH = "8662b532afbae3b551be21167442dc4837021a2b86bf9381c6b86e7107eaa2f73071966b1c113976640abbc5a95703437976c33cb607ff3547df59b20c22f64e"

RPROVIDES:${PN} += "cmake(dbusmenu-qt5) \
libdbusmenu-qt5-devel \
libdbusmenu-qt5-devel(aarch-64) \
pkgconfig(dbusmenu-qt5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-qt5-2 \
pkgconfig(Qt5Core)"

inherit rpm
