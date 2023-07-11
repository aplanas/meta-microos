SUMMARY = "Development Files for libburn"
DESCRIPTION = "Development files for developing applications using libburn."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "libburn-devel-1.5.6-1.1.aarch64.rpm"
RPM_HASH = "e3f785ce131ff11979e0f1ee95d3a2fdc3d06ac809a7b2c8ec5c1ea8477802298b98d76c847bec82252eeef0d003dfaf95b729335ba53a89cd6677aa4e038ea9"

RPROVIDES:${PN} += "libburn-devel \
pkgconfig-libburn-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libburn4"

inherit rpm
