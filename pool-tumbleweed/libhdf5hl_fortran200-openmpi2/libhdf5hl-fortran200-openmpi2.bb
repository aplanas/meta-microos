SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi2 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran200-openmpi2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "fc19b3fa7c02b9e6a0c33166b31c10ff185f15d664385a59350db504dca9b6b4e9a3f72eda258dd672843d7e28c0cadf56dbb2c9678d0e51ee069227cbb5efac"

RPROVIDES:${PN} += "libhdf5hl-fortran-openmpi2 \
libhdf5hl-fortran.so.200 \
libhdf5hl-fortran200-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5-fortran.so.200 \
libhdf5-hl.so.200 \
libhdf5.so.200"

inherit rpm
