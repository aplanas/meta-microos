SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mvapich2 version of the PnetCDF runtime \
libraries."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf4-mvapich2-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "e4f5a48871c95f8f436244e284a10a10ade4559be7f75f063a95f8bdb9ba8e242aaecf5e381e9c191d32d7bbd52fa06154ae7f19ffb39d899fd0e5f593f2101b"

RPROVIDES:${PN} += "libpnetcdf-mvapich2 \
libpnetcdf.so.4 \
libpnetcdf4-mvapich2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
