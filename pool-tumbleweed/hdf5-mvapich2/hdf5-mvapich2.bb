SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-mvapich2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "e323cb1b1cba8ee58d88d77ab8de287dbd0d3c57f56d970e4165fb3ca8a32399e8bd7780da74e7e8dac2a4f06028f505e918a59b356bf34106baa1c27f0ffe7a"

RPROVIDES:${PN} += "hdf5-mvapich2 \
hdf5-mvapich2(aarch-64)"
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
