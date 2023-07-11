SUMMARY = "I/O library for IEEE 1394 asynchronous transactions"
DESCRIPTION = "I/O library for IEEE 1394 asynchronous transactions to/from units on the bus, \
with GObject Introspection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libhinawa2-2.4.0-1.7.aarch64.rpm"
RPM_HASH = "398f6e92f26174f520069c917e1d4e220b2c5a236d930b7be9233a7ae4c8e9b83b9b42ad2c5f578810545b40489bc312b838e7743b12b003d04a8109702854e1"

RPROVIDES:${PN} += "libhinawa.so.2 \
libhinawa2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
