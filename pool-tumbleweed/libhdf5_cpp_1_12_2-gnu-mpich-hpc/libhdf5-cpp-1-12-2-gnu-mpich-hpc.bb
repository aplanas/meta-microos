SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp_1_12_2-gnu-mpich-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "3bed00482f27f237d87d5900f72675202e9562d7ec3661f772eff8a8911c328b29bc0383280eb2d9063883f0eed43052dd25452a3dde34bcdca1ef94a2eddefc"

RPROVIDES:${PN} += "libhdf5_cpp_1_12_2-gnu-mpich-hpc \
libhdf5_cpp_1_12_2-gnu-mpich-hpc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-mpich-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
