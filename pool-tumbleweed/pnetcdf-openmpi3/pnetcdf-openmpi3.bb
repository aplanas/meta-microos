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

RPM_NAME = "pnetcdf-openmpi3-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "ca5701603d896c1099a969dc723088d4e9a2ea8cd1d57421b1f071d006be7b2164dbcd2a8153a5c8a0e471797ac66b07ba5a4d29399af6009704bf5f4afdce1f"

RPROVIDES:${PN} += "parallel-netcdf-openmpi3 \
pnetcdf-openmpi3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40 \
libpnetcdf.so.4 \
libpnetcdf4-openmpi3 \
openmpi3"

inherit rpm
