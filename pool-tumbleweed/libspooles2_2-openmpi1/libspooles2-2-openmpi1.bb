SUMMARY = "A sparse matrix library"
DESCRIPTION = "SPOOLES is a library for solving sparse real and complex linear systems \
of equations, written in the C language using object oriented design. \
 \
This:1"
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "libspooles2_2-openmpi1-2.2-1.5.aarch64.rpm"
RPM_HASH = "880b318442293d4d4a7f464a65bff54ff73c624b92300a8afee7e3deba53f78e0aed2f2d43205d8c872d858421c4dd52b7b506a4eaeb0adc5a5632429694def9"

RPROVIDES:${PN} += "libspooles.so.2.2 \
libspooles2-2-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12"

inherit rpm
