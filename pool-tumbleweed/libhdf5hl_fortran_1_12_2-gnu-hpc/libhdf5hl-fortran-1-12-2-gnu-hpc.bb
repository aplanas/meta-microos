SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran_1_12_2-gnu-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "a5c75c6c3fe4d24f7569bf042f828819d59fc87b582702e67d41c4921444b093b917e2a1f1102e515185fa05f7d61c44e831f6262bfe098f9709c34f5252794a"

RPROVIDES:${PN} += "libhdf5hl_fortran_1_12_2-gnu-hpc \
libhdf5hl_fortran_1_12_2-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit)"

inherit rpm
