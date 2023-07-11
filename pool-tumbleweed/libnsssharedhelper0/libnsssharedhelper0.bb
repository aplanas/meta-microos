SUMMARY = "Helper functions for sharing NSS database"
DESCRIPTION = "This library provides helper functions for programs that want to share \
an NSS crypto database."
LICENSE = "LGPL-2.1+"

PV = "1.0.10"

RPM_NAME = "libnsssharedhelper0-1.0.10-9.27.aarch64.rpm"
RPM_HASH = "feb2c75a344a4c92ba12a86e353b6ea2b038c3267cb69dad21297786e5b8b0e7588a83408bd60cdb66be453a7f15ce39c3788601be98a9725c6403cd998cdb6d"

RPROVIDES:${PN} += "libnsssharedhelper.so.0 \
libnsssharedhelper0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so"

inherit rpm
