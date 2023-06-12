SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran_1_12_2-gnu-openmpi1-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "be3bee3a54ff9dd7719e495e6416c7dd78fdb4cd46dc54fe1133bcf16d97dbf996f80a858a91a3658979928c802bd7de6993953319fa0bc35de071cdfc2b420d"

RPROVIDES:${PN} += "libhdf5hl_fortran_1_12_2-gnu-openmpi1-hpc \
libhdf5hl_fortran_1_12_2-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-openmpi1-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit)"

inherit rpm
