SUMMARY = "Postfix plugin to support PostgreSQL maps"
DESCRIPTION = "Postfix plugin to support PostgreSQL maps. This library will be loaded \
by starting postfix if you'll access a postmap which is stored in \
PostgreSQL."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-postgresql-3.8.1-2.1.aarch64.rpm"
RPM_HASH = "f340fa6657e673559ae20625dc33e0e648a807dcd884b2726f32bc5c4af507d6f539f1fbee59d1859878e6c0cdec4e24e32e84ee71304110f777d05e9bc539d3"

RPROVIDES:${PN} += "postfix-postgresql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postfix"

inherit rpm
