SUMMARY = "Transport Independent RPC Library"
DESCRIPTION = "The Transport Independent RPC library (TI-RPC) is a replacement for the \
standard SunRPC library in glibc which does not support IPv6 addresses. \
This implementation allows the support of other transports than UDP and \
TCP over IPv4."
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "libtirpc3-1.3.3-1.6.aarch64.rpm"
RPM_HASH = "6d57e5a855e885d14a26762c6cd358ca97cd4548adc4f8fe71a4f985e264e6037fa154a95ab509eac4f56031aa401ac2c3a5e102a6ddec12977911c90592511b"

RPROVIDES:${PN} += "libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_0.3.0)(64bit) \
libtirpc.so.3(TIRPC_0.3.1)(64bit) \
libtirpc.so.3(TIRPC_0.3.2)(64bit) \
libtirpc.so.3(TIRPC_0.3.3)(64bit) \
libtirpc.so.3(TIRPC_PRIVATE)(64bit) \
libtirpc3 \
libtirpc3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libtirpc-netconfig"

inherit rpm
