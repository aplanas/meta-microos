SUMMARY = "A XMPP library for C"
DESCRIPTION = "The libstrophe library is a XMPP library written in C."
LICENSE = "GPL-3.0-or-later | MIT"

PV = "0.12.2"

RPM_NAME = "libstrophe0-0.12.2-1.5.aarch64.rpm"
RPM_HASH = "be63de842f20dd51b74555d3f94643bdb8fba204d7f337986f92be743ebcdcc6c57ca07d1175c1ddabce412e52fdb176e9414cf654fc387a1a6cda316403b494"

RPROVIDES:${PN} += "libstrophe.so.0 \
libstrophe0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libxml2.so.2"

inherit rpm
