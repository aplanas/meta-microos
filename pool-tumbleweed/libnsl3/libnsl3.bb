SUMMARY = "Network Support Library (NIS)"
DESCRIPTION = "The Network Support Library for NIS was formerly part of glibc and \
is now a standalone library. The big difference is, that this library \
has support for IPv6."
LICENSE = "LGPL-2.1-only"

PV = "2.0.0"

RPM_NAME = "libnsl3-2.0.0-1.13.aarch64.rpm"
RPM_HASH = "cf2fe66bb93a5ec91e5e41553ec3435be467c83a9fc8f42bb57ae89742d99ee5d61b5bfe4233a78af974576c3339c1dfdb03dea8b2806e0c4cec117c8ee7b79b"

RPROVIDES:${PN} += "libnsl.so.3()(64bit) \
libnsl.so.3(LIBNSL_PRIVATE)(64bit) \
libnsl3 \
libnsl3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtirpc.so.3()(64bit)"

inherit rpm
