SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "343ab6c6149bf571a12a71f39b713e00ebb36df57c68ed7209daffab6b1d3b45a1b8a6393fd9902a60c766dd9eb5632b7da34c169a55da0a7df589d5de913e9a"

RPROVIDES:${PN} += "libhdf5-hl-cpp \
libhdf5-hl-cpp.so.200 \
libhdf5-hl-cpp200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.200 \
libstdc++.so.6"

inherit rpm
