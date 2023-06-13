SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi1 version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi1-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "8c7d6601f97157694b0c48994f4cd58f82ac19396cc3185cb71b3f4e51114ead8ef3b7d5e07fb14985cbb06184a77e3f904e0eabc19c83c3c599a4bb97c3b124"

RPROVIDES:${PN} += "hdf5-openmpi1 \
hdf5-openmpi1(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhdf5-200 \
libhdf5.so.200()(64bit) \
libhdf5_fortran200 \
libhdf5_hl200 \
libhdf5hl_fortran200 \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpi.so.12()(64bit)"

inherit rpm
