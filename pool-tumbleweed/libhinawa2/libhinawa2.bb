SUMMARY = "I/O library for IEEE 1394 asynchronous transactions"
DESCRIPTION = "I/O library for IEEE 1394 asynchronous transactions to/from units on the bus, \
with GObject Introspection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libhinawa2-2.4.0-1.6.aarch64.rpm"
RPM_HASH = "1598776a96c564baff1b328090f3154a93196b3cb193ab4ceb1f4f266d3dc5b25efb89c06309a86c477c7388fa15ac0213857443d1f00f8e93e5a94fc13087db"

RPROVIDES:${PN} += "libhinawa.so.2 \
libhinawa2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
