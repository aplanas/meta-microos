SUMMARY = "An XMPP library for C"
DESCRIPTION = "Mesode is a collection of libraries for speaking the XMPP protocol. \
It focus extends chat-based applications; it has has been used to \
implement real-time games, notification systems, and search engines."
LICENSE = "GPL-3.0-or-later | MIT"

PV = "0.10.1"

RPM_NAME = "libmesode0-0.10.1-1.12.aarch64.rpm"
RPM_HASH = "cf43d110b552815012f3964b5f983f64e341ec9087d470df7b30e8beef5b4f871c575d475ae3e0a5cf297c46ee56a2f12333f9a04afa5da9590897b62d92188a"

RPROVIDES:${PN} += "libmesode.so.0 \
libmesode0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libssl.so.3"

inherit rpm
