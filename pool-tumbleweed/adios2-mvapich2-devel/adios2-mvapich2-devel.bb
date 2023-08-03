SUMMARY = "Development files for adios2-mvapich2"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
mvapich2 version of ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.0"

RPM_NAME = "adios2-mvapich2-devel-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "671e38b0e752075c566a7c442d152d7f73ffba26a621f9dbc5d5f2f9101596bd3a33103f8a2cc743cc19b0b777c10323a06aa16419f1a15aaa24114a5a24e8cf"

RPROVIDES:${PN} += "adios2-mvapich2-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libadios2-atl.so.2.9 \
libadios2-core-mpi.so.2.9 \
libadios2-core.so.2.9 \
libadios2-cxx11-mpi.so.2.9 \
libadios2-cxx11.so.2.9 \
libadios2-evpath.so.2.9 \
libadios2-ffs.so.2.9 \
libadios2-mvapich2-2-9 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
