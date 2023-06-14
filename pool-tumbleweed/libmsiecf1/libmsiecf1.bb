SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libmsiecf1-20221024-3.5.aarch64.rpm"
RPM_HASH = "0298ce7a4d4a024f7468be3c36a39c6ddb7baadcbc4b971fc93378a1854627d119de6216bd1bc79a48f7b42c878e541c9b27005ae79e4963d2818fb8047d42e8"

RPROVIDES:${PN} += "libmsiecf.so.1 \
libmsiecf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfvalue.so.1"

inherit rpm
