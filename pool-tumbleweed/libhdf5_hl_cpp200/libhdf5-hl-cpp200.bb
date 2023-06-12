SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "d70be7784513128c184fb2f614470b7036fc6b07c719434c86dcde4f587ca67d50b0e5e480aaec4749bf049fb0e1058baa5c31a940e0bd0fccd69b86475594e1"

RPROVIDES:${PN} += "libhdf5_hl_cpp \
libhdf5_hl_cpp.so.200()(64bit) \
libhdf5_hl_cpp200 \
libhdf5_hl_cpp200(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhdf5_hl.so.200()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
