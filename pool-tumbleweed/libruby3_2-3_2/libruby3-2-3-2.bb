SUMMARY = "Dynamic runtime library for Ruby"
DESCRIPTION = "Dynamic runtime library for Ruby"
LICENSE = "BSD-2-Clause | Ruby"

PV = "3.2.2"

RPM_NAME = "libruby3_2-3_2-3.2.2-1.1.aarch64.rpm"
RPM_HASH = "44e4c8f6a525334a94fc9b41d3394fb48e57168f85dcb98322fb63a58bbfe85c8da41296806ee300edb7561dbadc3d9cc437a9593d0d66ed5422aee7cf0956cc"

RPROVIDES:${PN} += "libruby3.2.so.3.2()(64bit) \
libruby3_2-3_2 \
libruby3_2-3_2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libz.so.1()(64bit)"

inherit rpm
