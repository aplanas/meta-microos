SUMMARY = "SDK for MPICH HPC version 4.0.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi_4_0_2-gnu-hpc-devel-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "c3532c1f5cbeb7f07edf29d5d4fedc2017e581f08e1a9bd3fcbb86e6cbfd718ec6790bb6e7abdd1e71a82d7514a53439da93e56340875279a8c985448042e7b8"

RPROVIDES:${PN} += "mpich-ofi-4-0-2-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1 \
libgfortran.so.5 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
mpich-ofi-4-0-2-gnu-hpc"

inherit rpm
