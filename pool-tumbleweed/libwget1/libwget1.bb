SUMMARY = "A library to download and mirror FTP/HTTP sites"
DESCRIPTION = "Wget enables you to retrieve WWW documents or FTP files from a \
server. This can be done in script files or via the command line. \
 \
libwget which provides an interface to many useful functions used by \
Wget2."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0.1"

RPM_NAME = "libwget1-2.0.1-1.6.aarch64.rpm"
RPM_HASH = "67a4661b3d5851b62f86c5a840937e69cfceebe6e1525252fa0c8d005191e0f1eb0fe99d5b8e8a4efca425d5590658a23ecf31b7e8d30670093ef84ae2d5494a"

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
