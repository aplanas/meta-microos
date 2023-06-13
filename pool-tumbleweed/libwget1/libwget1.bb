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

RPROVIDES:${PN} += "libwget.so.1()(64bit) \
libwget1 \
libwget1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbrotlidec.so.1()(64bit) \
libc.so.6()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libidn2.so.0()(64bit) \
libnghttp2.so.14()(64bit) \
libpsl.so.5()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
