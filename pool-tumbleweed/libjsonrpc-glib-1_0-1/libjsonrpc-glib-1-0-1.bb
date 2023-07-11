SUMMARY = "Library to communicate with JSON-RPC based peers"
DESCRIPTION = "This is a library to communicate with JSON-RPC based peers in \
either a synchronous or an asynchronous fashion. It also allows \
communicating using the GVariant serialization format instead \
of JSON when both peers support it. \
 \
This package contains the Jsonrpc-GLib shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "libjsonrpc-glib-1_0-1-3.44.0-1.2.aarch64.rpm"
RPM_HASH = "7b63639fb88d27b3fbf48903885b1dabf40c1177eb81842fa18431346f2fbdcdb7c5d1e3bd1e9d5e7ec82d6c9478e7a4ee60ae9648acfa2ab6d71008ec5db260"

RPROVIDES:${PN} += "libjsonrpc-glib-1-0-1 \
libjsonrpc-glib-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
