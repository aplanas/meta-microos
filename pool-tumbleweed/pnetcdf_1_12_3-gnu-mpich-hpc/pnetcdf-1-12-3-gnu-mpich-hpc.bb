SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
Parallel netCDF (PnetCDF) is a library providing high-performance I/O while \
still maintaining file-format compatibility with NetCDF by Unidata. \
 \
This package contains the mpich version of utility functions for \
working with NetCDF files."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-mpich-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "4e3d19a7051aa658df8a4da0916260809e27ac4320701261c56d061f3479cdc389da135ef71ad5501070092f7069706209414c621aeaf57b607472da897ad0af"

RPROVIDES:${PN} += "pnetcdf_1_12_3-gnu-mpich-hpc \
pnetcdf_1_12_3-gnu-mpich-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpnetcdf_1_12_3-gnu-mpich-hpc"

inherit rpm
