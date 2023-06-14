SUMMARY = "Library for Handling of Gadu-Gadu Instant Messaging"
DESCRIPTION = "libgadu is a library for handling of protocol of a popular Polish \
instant messenger Gadu-Gadu."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "libgadu3-1.12.2-2.18.aarch64.rpm"
RPM_HASH = "9ef43512eafc946daa97b005e7c1e1d2e026f7d9404fd5d6d0757e6df553adb578a31534e45718f7291f2bd219bbe71fa4e94d072ac81ae2dd2dae7e402bf4a2"

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
