SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp200-openmpi3-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "c3c980b620e9c2c0974d04dee88708860b8722ec3c2bcfd192ba33af0ed20690a4d765cf23610698fd1b9a17ef1d85e6391a7c31f067168f5654164425cc00ed"

RPROVIDES:${PN} += "libhdf5-cpp-openmpi3 \
libhdf5-cpp.so.200 \
libhdf5-cpp200-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libstdc++.so.6"

inherit rpm
