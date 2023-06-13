SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi3-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_1_12_2-gnu-openmpi3-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "8ff96d081e86e1c86919eef0a4bb84f8b22bfb444616894c902617be46dd83a51b84f665682fe96ef9f04a9be2044f8fefb98da524b8e6d88bdaacde34d94b8a"

RPROVIDES:${PN} += "libhdf5_1_12_2-gnu-openmpi3-hpc \
libhdf5_1_12_2-gnu-openmpi3-hpc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-openmpi3-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
