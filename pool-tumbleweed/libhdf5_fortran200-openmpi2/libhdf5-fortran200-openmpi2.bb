SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi2 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran200-openmpi2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "39642ee733843163751594ae675bb5a9147961b82c9e6ded9d3757dde1c727956d5cbd5857ab1c8a6c7519a76536225cbc0bfadfb17c2618d255d22a915b218b"

RPROVIDES:${PN} += "libhdf5_fortran-openmpi2 \
libhdf5_fortran.so.200()(64bit) \
libhdf5_fortran200-openmpi2 \
libhdf5_fortran200-openmpi2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libhdf5.so.200()(64bit) \
libmpi.so.20()(64bit)"

inherit rpm
