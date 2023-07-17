SUMMARY = "Development files for libphdi"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libphdi."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi-devel-20221025-3.12.aarch64.rpm"
RPM_HASH = "1b97a1c002d56d61321f18da97dfe84a57aa590af18ae2467fcc40d903230a0b299a28bfc0b1dd5aa4ced65cb840d8f61e09d17d24aa48c3a1aec3ba5bc88e00"

RPROVIDES:${PN} += "libphdi-devel \
pkgconfig-libphdi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libphdi1"

inherit rpm
