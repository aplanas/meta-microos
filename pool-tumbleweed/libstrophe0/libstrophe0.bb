SUMMARY = "A XMPP library for C"
DESCRIPTION = "The libstrophe library is a XMPP library written in C."
LICENSE = "GPL-3.0-or-later | MIT"

PV = "0.12.2"

RPM_NAME = "libstrophe0-0.12.2-1.4.aarch64.rpm"
RPM_HASH = "f8f300c624b4946bfc0ee7bcf3bde4c49b34fb5d6893a1d1d2754051fa87046496fed5e7cc82f67650862880ea1b7c00bcbf529fe5e5c5df777db2d68dab095a"

RPROVIDES:${PN} += "libstrophe.so.0 \
libstrophe0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libxml2.so.2"

inherit rpm
