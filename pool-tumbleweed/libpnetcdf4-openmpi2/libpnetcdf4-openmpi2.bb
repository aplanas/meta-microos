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

RPM_NAME = "libpnetcdf4-openmpi2-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "dfb723da0d407d5c5b80486413e9cd87c838fc43f5110d542632d30989690c858fd4061a59561dab9fb60957ab31d0263a458057868cb6e1133fd9de5e9fd3f7"

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
