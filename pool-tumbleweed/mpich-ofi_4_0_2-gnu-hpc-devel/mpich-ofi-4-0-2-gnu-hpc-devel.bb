SUMMARY = "SDK for MPICH HPC version 4.0.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi_4_0_2-gnu-hpc-devel-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "77e8db4a34f0d3e0562f187d8a5eacbdacb1a951c321d7436a8b6b01bd4e4b17c999b06a1f2d62b081edc413b5c6d297ca46df7bc95a53d6f6088e9d53975cc3"

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
