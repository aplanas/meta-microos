SUMMARY = "SDK for MPICH HPC version 4.0.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich_4_0_2-gnu-hpc-devel-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "83078a4315b0dee74a8622732be6e5a8fe941e3787a61ef1dd3eee91576a40d9de44480cebabd6b9879d39ed77f7138ffc1afa84b4f36fd23ab8a1a285f53f50"

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
