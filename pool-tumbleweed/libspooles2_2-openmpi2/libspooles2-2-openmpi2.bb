SUMMARY = "A sparse matrix library"
DESCRIPTION = "SPOOLES is a library for solving sparse real and complex linear systems \
of equations, written in the C language using object oriented design. \
 \
This:1"
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "libspooles2_2-openmpi2-2.2-1.4.aarch64.rpm"
RPM_HASH = "6ae2505a0ff217f5354d50fd9b01c9f62eb86f2f25a463b5d325fdda5cb5c04a0e276ce4856a7bd371a4ecfab9df2a1ad1eab9fcf14bdfbc112882fd4184913b"

RPROVIDES:${PN} += "libspooles.so.2.2()(64bit) \
libspooles2_2-openmpi2 \
libspooles2_2-openmpi2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpi.so.20()(64bit)"

inherit rpm
