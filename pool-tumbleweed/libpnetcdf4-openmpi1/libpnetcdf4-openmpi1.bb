SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi version of the PnetCDF runtime \
libraries."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf4-openmpi1-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "d33c7ddeddb53e491ecf52b6cd4423200e95b601317d2b48c37b109bf6ef908d12ac5a7e8354c9f958c489a28bd95cfc43b5eeaac62a08ba1f078af9cae58243"

RPROVIDES:${PN} += "libpnetcdf-openmpi1 \
libpnetcdf.so.4 \
libpnetcdf4-openmpi1"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmpi-cxx.so.1 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
