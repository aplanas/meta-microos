SUMMARY = "C library API for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
This subpackage contains the C library API for MLT."
LICENSE = "GPL-3.0-or-later"

PV = "7.16.0"

RPM_NAME = "libmlt-7-7-7.16.0-1.2.aarch64.rpm"
RPM_HASH = "aa55f41cfd4dace44ae1d348c239a84ed92c87b67983868714fb5b0435e68e83b167d74cd9df0184efdd9b57ac06a0a934fe80d2e030a2b052f2ee968eaf16c6"

RPROVIDES:${PN} += "libmlt-7-7 \
libmlt-7.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
