SUMMARY = "A sparse matrix library"
DESCRIPTION = "SPOOLES is a library for solving sparse real and complex linear systems \
of equations, written in the C language using object oriented design. \
 \
This:1"
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "libspooles2_2-openmpi2-2.2-1.5.aarch64.rpm"
RPM_HASH = "8351ffb21d10aee8822ba4eded25d44a398cee8ba13bb3ec647dd8afbff5cbba55bb31d8171f44befa63bbc41d42526dd1cea32bd7ff9d32a620bd7780e10040"

RPROVIDES:${PN} += "libspooles.so.2.2 \
libspooles2-2-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.20"

inherit rpm
