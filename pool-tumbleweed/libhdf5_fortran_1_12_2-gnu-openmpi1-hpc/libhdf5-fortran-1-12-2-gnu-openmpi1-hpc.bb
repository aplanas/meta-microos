SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran_1_12_2-gnu-openmpi1-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "155db149fa0671cf676db3d11e8941de8dc7b7eb17bd99f103d3d110804b0b66a049f8170431e915e738d8a1345d192f3f914522ee532561b9d0b1764117c175"

RPROVIDES:${PN} += "libhdf5-fortran-1-12-2-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi1-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5"

inherit rpm
