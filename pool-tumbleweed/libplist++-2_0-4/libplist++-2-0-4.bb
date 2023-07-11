SUMMARY = "Library for handling Apple Binary and XML Property Lists"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "libplist++-2_0-4-2.3.0-1.2.aarch64.rpm"
RPM_HASH = "da0730571fbc5025f7ecb9517f030f65443f395033dfd79e7c931d942bdc6bd1a76ba2206b391484ac61d9d50f54d730ad881d156555909e7c89fb84ac712eec"

RPROVIDES:${PN} += "libplist++-2-0-4 \
libplist++-2.0.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libplist-2.0.so.4 \
libstdc++.so.6"

inherit rpm
