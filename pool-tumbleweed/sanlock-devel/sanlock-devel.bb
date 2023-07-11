SUMMARY = "Development files for sanlock"
DESCRIPTION = "The sanlock-devel package contains libraries and header files for \
developing applications that use sanlock."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.8.5"

RPM_NAME = "sanlock-devel-3.8.5-1.4.aarch64.rpm"
RPM_HASH = "94f8a2668d81aeba530ea551a22b12bb16617eadcd4d59ac0beb641a05b715ccbd08a906bbcc531335b229815f468bb1fe03caa0afcad426e79271bd4dfce269"

RPROVIDES:${PN} += "pkgconfig-libsanlock \
pkgconfig-libsanlock-client \
sanlock-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsanlock1"

inherit rpm
