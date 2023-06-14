SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi3-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran_1_12_2-gnu-openmpi3-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "ff0059a9098900a243fe23d776e868729f45de65d0e398537528c2f5774e8f7686719e071bf2133f96ed63e8c31c1c10ad0626500ba7ad72e7b9ae82f55cd631"

RPROVIDES:${PN} += "libhdf5-fortran-1-12-2-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi3-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5"

inherit rpm
