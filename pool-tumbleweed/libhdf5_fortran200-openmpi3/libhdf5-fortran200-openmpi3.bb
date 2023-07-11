SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi3 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran200-openmpi3-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "81b84426ef6b84f8864f343831a9ccc75d1dfb0a42a3e20beee94a63b6a079fd41c68366ba5b2f115653492dcdcf77482feee7331ff8e505530907ece561d3bd"

RPROVIDES:${PN} += "libhdf5-fortran-openmpi3 \
libhdf5-fortran.so.200 \
libhdf5-fortran200-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5.so.200 \
libmpi.so.40"

inherit rpm
