SUMMARY = "Development files for adios2-mpich"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
mpich version of ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.0"

RPM_NAME = "adios2-mpich-devel-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "c9e1c589b5e415afb97693b4d3d9c6ac064d1f733451cc49e8d3e953bfa7f46d0d94bc5b1d4ed8b9234ff1c6d1a4cfb56d1597b08319bc027c5153dbaf8a5ed6"

RPROVIDES:${PN} += "adios2-mpich-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libadios2-atl.so.2.9 \
libadios2-core-mpi.so.2.9 \
libadios2-core.so.2.9 \
libadios2-cxx11-mpi.so.2.9 \
libadios2-cxx11.so.2.9 \
libadios2-evpath.so.2.9 \
libadios2-ffs.so.2.9 \
libadios2-mpich-2-9 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
