SUMMARY = "Library for manipulation with .zip archives"
DESCRIPTION = "Minizip is a library for manipulation with files from .zip archives."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "libminizip1-1.2.13-4.1.aarch64.rpm"
RPM_HASH = "77496b6b1caae7a1557d91c52511a96e5bcc2d1046bef7aa7d896230f27004f9429b18ba7ebe82e959b0bf7f57962f7af2117afbcf9bbb8a86001334d755dcf2"

RPROVIDES:${PN} += "libminizip.so.1()(64bit) \
libminizip1 \
libminizip1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libz.so.1()(64bit)"

inherit rpm
