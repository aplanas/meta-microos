SUMMARY = "Library to handle the serialization/deserialization part of RPC"
DESCRIPTION = "Searpc is a simple C language RPC framework based on GObject system. Searpc handles the serialization/deserialization part of RPC, the transport part is left to users. \
 \
The serialization/deserialization uses JSON format via json-glib library. A serialized json object is returned from server to client after executing the RPC function. Each RPC function defined in the server side should take an extra GError argument to report error."
LICENSE = "Apache-2.0"

PV = "3.3.0.20230527"

RPM_NAME = "libsearpc1-3.3.0.20230527-1.1.aarch64.rpm"
RPM_HASH = "f3732d9d45c9c4bc5f2c9b88d6dc1f9fff7968f5705b1533da5bff9eaf0206a0f7d5c61ab86d719dd741866f2c23e7b064bceddc70b53f7b85e504f51a1dfe0f"

RPROVIDES:${PN} += "libsearpc.so.1 \
libsearpc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4"

inherit rpm
