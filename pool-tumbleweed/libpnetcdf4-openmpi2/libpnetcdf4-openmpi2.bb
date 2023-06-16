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

RPM_NAME = "libpnetcdf4-openmpi2-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "dcbc460b11dce0a8faad07e7fd520b931a69baa1cb79fda6c7212b3416c10c306a95a3b1daba56d9edaaa5631a090104add064740259e055a4c34e775b27142e"

RPROVIDES:${PN} += "libpnetcdf-openmpi2 \
libpnetcdf.so.4 \
libpnetcdf4-openmpi2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmpi.so.20 \
libstdc++.so.6"

inherit rpm
