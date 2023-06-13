SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi2 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-200-openmpi2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "bbb59baed6298a6aa94fd1211181779a5951292bb33d47c1b98d120a9adc437169def1985024ef27446b1bca7d1bb766e79832a24790683b0f0ca284eee1c4e8"

RPROVIDES:${PN} += "libhdf5-200-openmpi2 \
libhdf5-200-openmpi2(aarch-64) \
libhdf5-openmpi2 \
libhdf5.so.200()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi.so.20()(64bit) \
libz.so.1()(64bit)"

inherit rpm
