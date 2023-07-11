SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp_1_12_2-gnu-mvapich2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "5e8130adcec8e3a4dd0cedfdb5f1213d8c53a686af316c94dddfb6963161b56743e04241479365f1e0ed4e0758774af0ab503ac843be17ee5acbc3ff27d742eb"

RPROVIDES:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-mvapich2-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
