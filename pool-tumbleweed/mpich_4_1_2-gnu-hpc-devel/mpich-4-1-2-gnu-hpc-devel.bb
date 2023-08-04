SUMMARY = "SDK for MPICH HPC version 4.1.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich_4_1_2-gnu-hpc-devel-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "82ed2608ae5fb6264925de7f8d9768d26352b781c7ee1d8a46fea3aa1a9a9e899a7f488376216944fb53a58e2bd7b547690ea51565ffc19a91d3dff50488753a"

RPROVIDES:${PN} += "mpich-4-1-2-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
libucp.so.0 \
libucs.so.0 \
mpich-4-1-2-gnu-hpc"

inherit rpm
