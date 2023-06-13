SUMMARY = "Helper functions for sharing NSS database"
DESCRIPTION = "This library provides helper functions for programs that want to share \
an NSS crypto database."
LICENSE = "LGPL-2.1+"

PV = "1.0.10"

RPM_NAME = "libnsssharedhelper0-1.0.10-9.26.aarch64.rpm"
RPM_HASH = "c4d3d257ea5f95108885e34af8d9f7303420ac19fdd1b031635bef168b677167cef72386e9be26e6cd9876180d25b95d719155f8d855b536d49998de18aa892c"

RPROVIDES:${PN} += "libnsssharedhelper.so.0()(64bit) \
libnsssharedhelper0 \
libnsssharedhelper0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit)"

inherit rpm
