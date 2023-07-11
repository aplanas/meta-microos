SUMMARY = "C API for the Thrift software framework"
DESCRIPTION = "Shared library providing the C API for the Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "libthrift_c_glib0-0.17.0-1.9.aarch64.rpm"
RPM_HASH = "68aa1f29f0872c841ea7d42e78ecfcb85b76eadcaa398d305c77865b8f8065fe8d3b449ad604367de400d371a5edce48ac4f00d6ae6e38e0960911a6694d2d54"

RPROVIDES:${PN} += "libthrift-c-glib.so.0 \
libthrift-c-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libssl.so.3 \
libz.so.1"

inherit rpm
