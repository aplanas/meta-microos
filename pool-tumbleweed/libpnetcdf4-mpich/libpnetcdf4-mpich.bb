SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mpich version of the PnetCDF runtime \
libraries."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf4-mpich-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "9a382e0bcdca15171f5700f29d1091e9c7623ae3d51e92dbfcfc4c0ef928a5f743138d944409d2c5dbb10066c1f91cc3eaead3b83e7ac4bac7f4ba2fe5257730"

RPROVIDES:${PN} += "libpnetcdf-mpich \
libpnetcdf.so.4 \
libpnetcdf4-mpich"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
