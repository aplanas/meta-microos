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

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi3-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "77f03a997f3e3505290e6ffb44c88a0dd51a9af5d0381388acc6a05c6ed23a1fdd1ca962b47186746cb2a92154cd38eb3a4ebf0606de64b2de2886faa52146cd"

RPROVIDES:${PN} += "pnetcdf-1-12-3-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpnetcdf-1-12-3-gnu-openmpi3-hpc"

inherit rpm
