SUMMARY = "C API for the Thrift software framework"
DESCRIPTION = "Shared library providing the C API for the Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "libthrift_c_glib0-0.17.0-1.6.aarch64.rpm"
RPM_HASH = "68c94bc193acd816eec88e577b676b1759906f49b435cabe936e6b151dd2aa9e4927691f4373b7b2579072d398f908131e5d5d560e67cf68c35005b53dc8bafc"

RPROVIDES:${PN} += "libthrift_c_glib.so.0()(64bit) \
libthrift_c_glib0 \
libthrift_c_glib0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
