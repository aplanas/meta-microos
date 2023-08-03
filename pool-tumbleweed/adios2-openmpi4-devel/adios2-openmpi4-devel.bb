SUMMARY = "Development files for adios2-openmpi4"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
openmpi4 version of ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.0"

RPM_NAME = "adios2-openmpi4-devel-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "4cda42ac730567bc10535502e024ec07359461df67ce9292e87bb656a8fdcbaf7510d133c351d2f68e825ed635b2efba2bae045228ea640c699e69cb66f5d473"

RPROVIDES:${PN} += "adios2-openmpi4-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libadios2-atl.so.2.9 \
libadios2-core-mpi.so.2.9 \
libadios2-core.so.2.9 \
libadios2-cxx11-mpi.so.2.9 \
libadios2-cxx11.so.2.9 \
libadios2-evpath.so.2.9 \
libadios2-ffs.so.2.9 \
libadios2-openmpi4-2-9 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
