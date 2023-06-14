SUMMARY = "Fielded Free Text Engine with a Z39.50 Frontend"
DESCRIPTION = "Zebra is a fielded free text indexing and retrieval engine with a \
Z39.50 front-end. You can use any compatible, commercial, or freeware \
Z39.50 client to access data stored in Zebra."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.7"

RPM_NAME = "idzebra-2.2.7-1.1.aarch64.rpm"
RPM_HASH = "1b4ea594d0eebdd1bbf565f29698a79737d11f4c7c8d3e616e46e92e7629bf21aeadb2477b4104ef6b5d718690679d6b62bfc727d6b4c3da8c9abdcdfb8414a1"

RPROVIDES:${PN} += "config-idzebra \
idzebra \
libidzebra-2.0.so.0"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libexpat.so.1 \
libexslt.so.0 \
libtcl8.6.so \
libxml2.so.2 \
libxslt.so.1 \
libyaz-icu.so.5 \
libyaz-server.so.5 \
libyaz.so.5 \
libz.so.1 \
yaz"

inherit rpm
