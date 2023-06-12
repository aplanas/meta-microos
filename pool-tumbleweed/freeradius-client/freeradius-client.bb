SUMMARY = "FreeRADIUS Client Software"
DESCRIPTION = "A portable, easy-to-use and standard compliant library suitable for \
developing free and commercial software that need support for a RADIUS \
protocol (RFCs 2128 and 2139)."
LICENSE = "BSD-2-Clause"

PV = "1.1.7"

RPM_NAME = "freeradius-client-1.1.7-1.30.aarch64.rpm"
RPM_HASH = "95fd73f98317b242e56dcb2cab30558cc0ffa59ab96a5a804ed61e625e55332c3c7eee47e753711b56dc04cd7aae32a9603ab86cff6bd1823c91e0136281b03e"

RPROVIDES:${PN} += "config(freeradius-client) \
freeradius-client \
freeradius-client(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libfreeradius-client.so.2()(64bit)"

inherit rpm
