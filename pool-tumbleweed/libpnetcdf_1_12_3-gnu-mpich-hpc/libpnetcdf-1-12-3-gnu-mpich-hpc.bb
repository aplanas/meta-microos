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

RPM_NAME = "libpnetcdf_1_12_3-gnu-mpich-hpc-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "2a650b0a49d387e212f0c2e4d73096ee962cd0a4a34fda1ea52b24cf7de60795a5106497b3f4311e3a52e7f4177f8549f5bbfe011d5733556db6e23e3c35dd96"

RPROVIDES:${PN} += "libpnetcdf-1-12-3-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libstdc++.so.6 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
