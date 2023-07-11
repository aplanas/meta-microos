SUMMARY = "SDK for MPICH HPC version 4.0.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich_4_0_2-gnu-hpc-devel-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "a4a04049ec005a835e22b9a7004cb1267d55f540dc8fe737148f568d91296a163349079458256f054c2065ea2db8359527572670ce72dd181fb26d9846c64199"

RPROVIDES:${PN} += "mpich-4-0-2-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
libucp.so.0 \
libucs.so.0 \
mpich-4-0-2-gnu-hpc"

inherit rpm
