SUMMARY = "A library to deshake video"
DESCRIPTION = "A library to deshake videos, designed to stabilize even strongly jiggled clips."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "libvidstab1_1-1.1.0-2.19.aarch64.rpm"
RPM_HASH = "fc17a58586aa6bbcc18fd683e1209eefd6b142e06a6ac19e2271f5af7df273c6067e4d1dfe4b7ecb955939c5bf828bc05042a1232b06011936ff2aa5587a4a34"

RPROVIDES:${PN} += "libvidstab.so.1.1()(64bit) \
libvidstab1_1 \
libvidstab1_1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
