SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi2-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_1_12_2-gnu-openmpi2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "96f834c3f96d4b447911520e110d4aaec21a583340a854c4853905d581b2dba1a749da44c63ab75135f5f5fcdb22dad5206059e0403520de37e61799cb1631e3"

RPROVIDES:${PN} += "libhdf5-1-12-2-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi2-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
