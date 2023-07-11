SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi1 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran200-openmpi1-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "f4bfb23765760939fc0447a2b969eb217733871158801452bc271c959458983a8db1113872e8f84a6cb89a60795980cbc96869a709d826760980edd5906797b4"

RPROVIDES:${PN} += "libhdf5-fortran-openmpi1 \
libhdf5-fortran.so.200 \
libhdf5-fortran200-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5.so.200 \
libmpi.so.12"

inherit rpm
