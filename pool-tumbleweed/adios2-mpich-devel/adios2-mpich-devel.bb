SUMMARY = "Development files for adios2-mpich"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
mpich version of ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "adios2-mpich-devel-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "99fd738d52a36b47a1a6e4f35573189169c8acc79be4efbd59a02eb811227af8a9432369f41d2ee4821ddca33bd00cc3cc0aca04785375e21c60b49361076b15"

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
