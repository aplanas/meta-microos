SUMMARY = "Panorama Tools Back-End Library"
DESCRIPTION = "Library and utilities for working with panoramas."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.21"

RPM_NAME = "libpano13-3-2.9.21-1.9.aarch64.rpm"
RPM_HASH = "32578475e79ede66e4d9721eb53daae2c98b204feb73ef6d1a345ac2a7457d6beb75c087a1ced7c1dd0408e09470a4e9d73445c42125f38293b39c8bc36164ea"

RPROVIDES:${PN} += "libpano13-3 \
libpano13.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
