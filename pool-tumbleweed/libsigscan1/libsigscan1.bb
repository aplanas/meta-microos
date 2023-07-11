SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning"
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "libsigscan1-20230109-1.6.aarch64.rpm"
RPM_HASH = "6703eca1ba383dc625a34dc2120ca9c4dd6c08ae5ed8b20dbe0c132564fe37811826ac055951523a6b89cf43da390a0e3aa94aba951209b48f1ccedd84213b1a"

RPROVIDES:${PN} += "libsigscan.so.1 \
libsigscan1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1"

inherit rpm
