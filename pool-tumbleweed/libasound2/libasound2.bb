SUMMARY = "Advanced Linux Sound Architecture Library"
DESCRIPTION = "This package contains the library for ALSA, Advanced Linux Sound \
Architecture."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.10"

RPM_NAME = "libasound2-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "eb3d96608985c23fb0d1fb259f3e21e5cc5031360c48dab01e59b6baa25acca3d95c967310851340a05f67ae8dc61db93ccb53f4de56d9a8e5dc86dfa6fc8bdb"

RPROVIDES:${PN} += "alsa-lib \
libasound.so.2 \
libasound2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
