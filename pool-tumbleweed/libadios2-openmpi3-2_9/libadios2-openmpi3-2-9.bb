SUMMARY = "The Adaptable IO System (ADIOS2) run-time libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the shared libraries for ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "libadios2-openmpi3-2_9-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "935359c2eeb6e1cef7d159292181be6dda3cdf5afb4cc1fffa68f05d50b41adaf18ae1069e4b4266bcffa9575cd70a347a57c220424027dc80a0c10341a876a4"

RPROVIDES:${PN} += "adios2-openmpi3 \
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
libadios2-openmpi3-2-9"

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
