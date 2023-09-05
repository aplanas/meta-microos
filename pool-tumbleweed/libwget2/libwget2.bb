SUMMARY = "A library to download and mirror FTP/HTTP sites"
DESCRIPTION = "Wget enables you to retrieve WWW documents or FTP files from a \
server. This can be done in script files or via the command line. \
 \
libwget which provides an interface to many useful functions used by \
Wget2."
LICENSE = "LGPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libwget2-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "aff14022daad04e963c0481d2653d0c72dba761b2fbf5bf87d3aa82e2cfce542eedcaa9d2b58092aa19508a1c448823e9e4973265a40b370116c4bb30d807a64"

RPROVIDES:${PN} += "libwget.so.2 \
libwget2"

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
