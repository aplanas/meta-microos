SUMMARY = "A sparse matrix library"
DESCRIPTION = "SPOOLES is a library for solving sparse real and complex linear systems \
of equations, written in the C language using object oriented design. \
 \
This:0"
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "libspooles2_2-2.2-1.4.aarch64.rpm"
RPM_HASH = "58c0dc958e00d57b40a170949c8e4fce5453439383d5620f79dc83a5e911e09bd21c1e585432ff4562f286925367f66697db86d2e5082eac4ef61a6d8351811a"

RPROVIDES:${PN} += "libspooles.so.2.2()(64bit) \
libspooles2_2 \
libspooles2_2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
