SUMMARY = "Fielded Free Text Engine with a Z39.50 Frontend"
DESCRIPTION = "Zebra is a fielded free text indexing and retrieval engine with a \
Z39.50 front-end. You can use any compatible, commercial, or freeware \
Z39.50 client to access data stored in Zebra."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.7"

RPM_NAME = "idzebra-2.2.7-1.1.aarch64.rpm"
RPM_HASH = "1b4ea594d0eebdd1bbf565f29698a79737d11f4c7c8d3e616e46e92e7629bf21aeadb2477b4104ef6b5d718690679d6b62bfc727d6b4c3da8c9abdcdfb8414a1"

RPROVIDES:${PN} += "config(idzebra) \
idzebra \
idzebra(aarch-64) \
libidzebra-2.0.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libexpat.so.1()(64bit) \
libexslt.so.0()(64bit) \
libtcl8.6.so()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libxslt.so.1(LIBXML2_1.0.18)(64bit) \
libyaz.so.5()(64bit) \
libyaz_icu.so.5()(64bit) \
libyaz_server.so.5()(64bit) \
libz.so.1()(64bit) \
yaz"

inherit rpm
