SUMMARY = "Multilingual text processing library for the C language"
DESCRIPTION = "A multilingual text processing library for the C language"
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "m17n-lib-devel-1.8.0-1.13.aarch64.rpm"
RPM_HASH = "80c4f16063a2dbfd4e8f234eadfd8c42efc3719a931c9f3a00c0921cd8c9d2f65f2b5c8cd49e955df1ef86a020db6b7e9b9306cc5070e50213558f0dcfb46492"

RPROVIDES:${PN} += "m17n-lib-devel \
pkgconfig-m17n-core \
pkgconfig-m17n-flt \
pkgconfig-m17n-gui \
pkgconfig-m17n-shell"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
m17n-lib"

inherit rpm
