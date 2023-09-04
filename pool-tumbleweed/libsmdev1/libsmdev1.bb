SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "libsmdev1-20221028-3.1.aarch64.rpm"
RPM_HASH = "716a5ffdc926665b0ccf3ad8240068b80b864994df688b2b975e980c0ad240ef51b49c0c691c1285cbb167d2d8fd962ab3c99f7c977bddffded6ad44f3ea89c1"

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
