SUMMARY = "C++ library API for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
This subpackage contains the C++ library API for MLT."
LICENSE = "GPL-3.0-or-later"

PV = "7.16.0"

RPM_NAME = "libmlt++-7-7-7.16.0-1.2.aarch64.rpm"
RPM_HASH = "ad42f9ad1391b09a74883598c6599c707dd878aab4261c6e1fab5a0e33d3e6ddc7610fc38b3d621c07234da074e0357d04ca0c545417fffdc0ecc0f8d7a54a66"

RPROVIDES:${PN} += "libmlt++-7-7 \
libmlt++-7.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmlt-7.so.7 \
libstdc++.so.6"

inherit rpm
