SUMMARY = "AV1 decoder library"
DESCRIPTION = "dav1d is an AV1 decoder library."
LICENSE = "BSD-2-Clause"

PV = "1.2.1"

RPM_NAME = "libdav1d6-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "d6ca491338ec4206abbf04cf3d66a437498c5ad5157cdd35b465c7e7ba38af8deada77764f829114ebe0aafd7e64e68804eb3c8fdc7a5d3af4ebd3554af139cf"

RPROVIDES:${PN} += "libdav1d.so.6()(64bit) \
libdav1d6 \
libdav1d6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
