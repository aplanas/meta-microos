SUMMARY = "Library to handle the serialization/deserialization part of RPC"
DESCRIPTION = "Searpc is a simple C language RPC framework based on GObject system. Searpc handles the serialization/deserialization part of RPC, the transport part is left to users. \
 \
The serialization/deserialization uses JSON format via json-glib library. A serialized json object is returned from server to client after executing the RPC function. Each RPC function defined in the server side should take an extra GError argument to report error."
LICENSE = "Apache-2.0"

PV = "3.3.0.20230224"

RPM_NAME = "libsearpc1-3.3.0.20230224-1.1.aarch64.rpm"
RPM_HASH = "f1ad0bfbf495a9f401c58fa97bc6edc6214adedb396e1edff68d80fecf2b960be1e95e606fa50325f42f42a02c4437ff0a31252f3093976818828ff21af087cc"

RPROVIDES:${PN} += "libsearpc.so.1()(64bit) \
libsearpc1 \
libsearpc1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit)"

inherit rpm
