SUMMARY = "The Adaptable IO System (ADIOS2) run-time libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the shared libraries for ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.0"

RPM_NAME = "libadios2-openmpi4-2_9-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "34addcd4ac6bc5828b0a729ecd9441cd2693ecd0c42c0ebdf671124ce6cf2be5b19dcf1a7f9163ff0e82b831efb806974fdb8ba6be763eb7fbc8c6753e7961c7"

RPROVIDES:${PN} += "adios2-openmpi4 \
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
libadios2-openmpi4-2-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
