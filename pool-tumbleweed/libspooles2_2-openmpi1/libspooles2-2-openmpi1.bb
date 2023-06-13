SUMMARY = "A sparse matrix library"
DESCRIPTION = "SPOOLES is a library for solving sparse real and complex linear systems \
of equations, written in the C language using object oriented design. \
 \
This:1"
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "libspooles2_2-openmpi1-2.2-1.4.aarch64.rpm"
RPM_HASH = "908ef154e8e8db4c89c2d4a8ad70dfe95f3caee8bffcfd39b3e55a652efa2d23ad84c1b040d7c22f2e92ae98c092e7b03ebc20a979fdfda4642d0c71d1819f0b"

RPROVIDES:${PN} += "libspooles.so.2.2()(64bit) \
libspooles2_2-openmpi1 \
libspooles2_2-openmpi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpi.so.12()(64bit)"

inherit rpm
