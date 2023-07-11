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

RPM_NAME = "pnetcdf-mpich-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "402103873d04172179dd2453dcd90bb3266cf166c1446eede9bed54d52fa7f04ff0c743a8e80f06342371f1a988c28cacc325f3645d323dd51ff742c73547057"

RPROVIDES:${PN} += "parallel-netcdf-mpich \
pnetcdf-mpich"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12 \
libpnetcdf.so.4 \
libpnetcdf4-mpich \
mpich"

inherit rpm
