SUMMARY = "Server and client commands for p11-kit"
DESCRIPTION = "Command line tools that enable to export PKCS#11 modules through a \
Unix domain socket.  Note that this feature is still experimental."
LICENSE = "BSD-3-Clause"

PV = "0.24.1"

RPM_NAME = "p11-kit-server-0.24.1-2.3.aarch64.rpm"
RPM_HASH = "8a3bde3b966c9d852a1956a3bb56f50ed7675c5bc37bba1065b8563be70aaa28247f29394c7003424be0dd7327544cd13777d21c982eba6b46215984c1a02322"

RPROVIDES:${PN} += "p11-kit-server \
p11-kit-server(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
libp11-kit.so.0()(64bit) \
libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
p11-kit(aarch-64)"

inherit rpm
