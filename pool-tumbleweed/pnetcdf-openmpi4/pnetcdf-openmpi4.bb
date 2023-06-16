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

RPM_NAME = "pnetcdf-openmpi4-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "34f58084bb80d0aa327342c2089533e905af91d03782ee49778deb4897679164d24d4e58c5eea7995f181fed750f9990b42a9cf3a963d98d7d9b9afca821c421"

RPROVIDES:${PN} += "parallel-netcdf-openmpi4 \
pnetcdf-openmpi4"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40 \
libpnetcdf.so.4 \
libpnetcdf4-openmpi4 \
openmpi4"

inherit rpm
