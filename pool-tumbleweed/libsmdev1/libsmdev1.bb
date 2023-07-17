SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "libsmdev1-20221028-2.12.aarch64.rpm"
RPM_HASH = "5842ca5d89f1dbb70b6bb41b13c3b3135e28ff198770380351e95e7eee314f489b8c9dfa49b15497984eb9ac04d84adab67ca2f6a1abf1c54ab45b181690d362"

RPROVIDES:${PN} += "libsmdev.so.1 \
libsmdev1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
