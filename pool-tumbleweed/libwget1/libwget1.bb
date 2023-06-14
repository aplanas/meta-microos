SUMMARY = "A library to download and mirror FTP/HTTP sites"
DESCRIPTION = "Wget enables you to retrieve WWW documents or FTP files from a \
server. This can be done in script files or via the command line. \
 \
libwget which provides an interface to many useful functions used by \
Wget2."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0.1"

RPM_NAME = "libwget1-2.0.1-1.5.aarch64.rpm"
RPM_HASH = "fa5b276b462a5008cf0f6de2516446f6642fd1df529a7ae769896c56244417a7bde446b4bff205f53114a07260e66147089f317540c855ea8513ae5010209e2c"

RPROVIDES:${PN} += "libwget.so.1 \
libwget1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libgnutls.so.30 \
libidn2.so.0 \
libnghttp2.so.14 \
libpsl.so.5 \
libz.so.1 \
libzstd.so.1"

inherit rpm
