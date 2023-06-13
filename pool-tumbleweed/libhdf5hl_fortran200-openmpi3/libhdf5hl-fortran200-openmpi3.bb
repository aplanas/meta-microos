SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi3 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran200-openmpi3-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "3a7276c96f0e61083d829bbcbdb25daad0448456801669e2818d6a3483c9767ffa479bdbf01129b347edff5853501c4c52db4921f1616300dac72c10d528657c"

RPROVIDES:${PN} += "libhdf5hl_fortran-openmpi3 \
libhdf5hl_fortran.so.200()(64bit) \
libhdf5hl_fortran200-openmpi3 \
libhdf5hl_fortran200-openmpi3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_fortran.so.200()(64bit) \
libhdf5_hl.so.200()(64bit)"

inherit rpm
