SUMMARY = "C API for the Thrift software framework"
DESCRIPTION = "Shared library providing the C API for the Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "libthrift_c_glib0-0.17.0-1.10.aarch64.rpm"
RPM_HASH = "3c66854900efc96ac742d89a1f20aa1a37f0cf6cc8aac5d52882f563ff50bd04aa3535d05956d321738540448a9688221c05fdbc66c6957ae231a8cc850b6f62"

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
