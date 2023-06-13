SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp_1_12_2-gnu-mpich-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "72e5daed2c5bfa50e72f9bac87a49a505b620613c0ec52f42b8f69ea566c746204871c3e667935b4f4abdf290fe4c72c1feb6a5e56e61fc74a5f1637f6b950e1"

RPROVIDES:${PN} += "libhdf5_hl_cpp_1_12_2-gnu-mpich-hpc \
libhdf5_hl_cpp_1_12_2-gnu-mpich-hpc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-mpich-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
