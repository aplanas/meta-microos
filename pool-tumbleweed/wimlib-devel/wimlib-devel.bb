SUMMARY = "Development files for wimlib"
DESCRIPTION = "Development files for wimlib"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.14.1"

RPM_NAME = "wimlib-devel-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "d417edfe81adc86bead1f39271d1ccd6f113f6220a3be15b67cb8909c57e2e408cc9c4a2d1a2ab8617f2908e8d5f5655915ddefcd67010c10aa273d7db1e387c"

RPROVIDES:${PN} += "pkgconfig-wimlib \
wimlib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwim15 \
pkgconfig-fuse \
pkgconfig-libntfs-3g"

inherit rpm
