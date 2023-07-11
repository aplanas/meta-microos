SUMMARY = "Signal Protocol C Library"
DESCRIPTION = "The libsignal-protocol-c library is a forward secrecy protocol library written in C."
LICENSE = "GPL-3.0-only"

PV = "2.3.3"

RPM_NAME = "libsignal-protocol-c2-2.3.3-1.14.aarch64.rpm"
RPM_HASH = "33bfe483a7a4bc68c6493fd226a30527128920a01dea10d80e8b667eba340ddbc893ce2422da62d0c47a9157f3fb9b5eb9c94156d4613e7b9d49f156069a9225"

RPROVIDES:${PN} += "libsignal-protocol-c.so.2 \
libsignal-protocol-c2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
