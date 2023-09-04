SUMMARY = "The Adaptable IO System (ADIOS2) run-time libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the shared libraries for ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "libadios2-mpich-2_9-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "ecd3c90ee985c02894b6f23bfb3abf60ee21de50c3b1e1805e463b9ae7d26e5a77b84baa8daa917b3855f27fd0e4679ad3709501f4a146a6e6eac4022a0e02b1"

RPROVIDES:${PN} += "adios2-mpich \
libadios2-atl.so.2.9 \
libadios2-c-mpi.so.2.9 \
libadios2-c.so.2.9 \
libadios2-cmenet.so \
libadios2-cmepoll.so \
libadios2-cmmulticast.so \
libadios2-cmselect.so \
libadios2-cmsockets.so \
libadios2-cmudp.so \
libadios2-cmzplenet.so \
libadios2-core-mpi.so.2.9 \
libadios2-core.so.2.9 \
libadios2-cxx11-mpi.so.2.9 \
libadios2-cxx11.so.2.9 \
libadios2-dill.so.2.9 \
libadios2-enet.so.2.9 \
libadios2-evpath.so.2.9 \
libadios2-ffs.so.2.9 \
libadios2-fortran-mpi.so.2.9 \
libadios2-fortran.so.2.9 \
libadios2-mpich-2-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
