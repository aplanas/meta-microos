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

RPM_NAME = "pnetcdf-openmpi2-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "eac0ad486494b85c811c4a1e526abc3751ed084ec9ca44d2bf6319ed6fe993233dffc10f759520f00e303191f260335b19bc8a156e92fbbe98ee8109618118b4"

RPROVIDES:${PN} += "parallel-netcdf-openmpi2 \
pnetcdf-openmpi2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.20 \
libpnetcdf.so.4 \
libpnetcdf4-openmpi2 \
openmpi2"

inherit rpm
