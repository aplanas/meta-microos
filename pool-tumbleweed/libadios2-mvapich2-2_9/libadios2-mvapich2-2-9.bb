SUMMARY = "The Adaptable IO System (ADIOS2) run-time libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the shared libraries for ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.0"

RPM_NAME = "libadios2-mvapich2-2_9-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "89c53b02c6b6d387acf24dbef7494d9c923ff9f4739247c64deef7dc83abe0d2d3c158173e5d4e2f1512aa10d1fd51432e3785f99ec97200e183a46ee043daec"

RPROVIDES:${PN} += "adios2-mvapich2 \
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
libadios2-mvapich2-2-9"

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
