SUMMARY = "Development files for libbd_utils"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_utils library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_utils-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "252e2bbb1c575829deeb60410836ec87708472357cf35e97590e31d65bc853e9f7efbadf5b0288a840f74788a92f0628fa7a52851c2fecc40db56183c049b572"

RPROVIDES:${PN} += "libbd-utils-devel \
pkgconfig-blockdev-utils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libbd-utils2 \
pkgconfig-glib-2.0"

inherit rpm
