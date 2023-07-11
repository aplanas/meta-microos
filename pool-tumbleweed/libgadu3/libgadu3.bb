SUMMARY = "Library for Handling of Gadu-Gadu Instant Messaging"
DESCRIPTION = "libgadu is a library for handling of protocol of a popular Polish \
instant messenger Gadu-Gadu."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "libgadu3-1.12.2-2.19.aarch64.rpm"
RPM_HASH = "5b079b461182486da9a44e0617fa9c81bdeeeaf97f10f7d3521553e2463f4044b28473bb1cfeac0febd47da4eacf00e1f9c811bd5481455fbe0dc06bed2f710d"

RPROVIDES:${PN} += "libgadu \
libgadu.so.3 \
libgadu3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libprotobuf-c.so.1 \
libz.so.1"

inherit rpm
