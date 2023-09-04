SUMMARY = "Development files for adios2-openmpi4"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
openmpi4 version of ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "adios2-openmpi4-devel-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "8d13ac9f1563e823aebfc5c0e23d7cab5b4c71a1681eb0bdcc4464b9c81f7cc18cc725053e23fd0d9cf76f034c12834f178ee1c4202b650a3dde2ca20d681c7c"

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
