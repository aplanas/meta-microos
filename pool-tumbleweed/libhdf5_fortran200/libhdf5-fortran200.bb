SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran200-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "8447f195bba6be89cc6b54c63bdd579e772307dcac8d1471a581245254903c8844986d3c860d7cf92d92c3d7bd1db8c169587be8d5485231964f3304ce850cf2"

RPROVIDES:${PN} += "libhdf5-fortran \
libhdf5-fortran.so.200 \
libhdf5-fortran200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5.so.200"

inherit rpm
