SUMMARY = "A sparse matrix library"
DESCRIPTION = "SPOOLES is a library for solving sparse real and complex linear systems \
of equations, written in the C language using object oriented design. \
 \
This:0"
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "libspooles2_2-2.2-1.5.aarch64.rpm"
RPM_HASH = "5741e415e9feb30a4fa41e867ee1847af8804389b7f4b5175519f8748de1135843f35dc27745750d7a1fd093ab53481b1a97962c0ed9f4ba7757bdb405a89ca4"

RPROVIDES:${PN} += "libspooles.so.2.2 \
libspooles2-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
