SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi3 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-200-openmpi3-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "627dd5012df80102c4845e7e94cbfa5fead6b87202425606752d523c28885021e3e11cc33881ee5cdb8c86514ba2bb1a97d081ae4f6a699799751a4826bafa7c"

RPROVIDES:${PN} += "libhdf5-200-openmpi3 \
libhdf5-200-openmpi3(aarch-64) \
libhdf5-openmpi3 \
libhdf5.so.200()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi.so.40()(64bit) \
libz.so.1()(64bit)"

inherit rpm
