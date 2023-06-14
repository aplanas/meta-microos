SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi3 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran200-openmpi3-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "4ba824f3570eb05be9dc6feb4f5116ae62aa954359887ff95fa0f1597fb0141e5d70c5ec3f8279c13a5c184890596a6dc7de4f1bf518863018f531ded7b4a4e6"

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
