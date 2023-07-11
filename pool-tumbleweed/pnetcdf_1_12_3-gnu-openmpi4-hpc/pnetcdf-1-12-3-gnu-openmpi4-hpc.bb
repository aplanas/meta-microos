SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
Parallel netCDF (PnetCDF) is a library providing high-performance I/O while \
still maintaining file-format compatibility with NetCDF by Unidata. \
 \
This package contains the openmpi version of utility functions for \
working with NetCDF files."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi4-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "6f017714f68a6bf5c6c598f5eb1921d5a76188067df634a3b3186694b7596e34c86a81ea8d0bf3c6e05d61a376710a105103b0f75c7093123fa1e6d991840908"

RPROVIDES:${PN} += "pnetcdf-1-12-3-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpnetcdf-1-12-3-gnu-openmpi4-hpc"

inherit rpm
