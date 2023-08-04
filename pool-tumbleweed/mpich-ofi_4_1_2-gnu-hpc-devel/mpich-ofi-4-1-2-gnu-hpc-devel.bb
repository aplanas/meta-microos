SUMMARY = "SDK for MPICH HPC version 4.1.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich-ofi_4_1_2-gnu-hpc-devel-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "fe743c5e8516e99b0a673a1dcc030215260711d076c1f26b9fd1633de8411280d9841910ad669976632d80703217d2622ee784831ea34c261646ecb81185015d"

RPROVIDES:${PN} += "mpich-ofi-4-1-2-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1 \
libgfortran.so.5 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
mpich-ofi-4-1-2-gnu-hpc"

inherit rpm
