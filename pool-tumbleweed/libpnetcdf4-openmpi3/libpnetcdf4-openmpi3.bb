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

RPM_NAME = "libpnetcdf4-openmpi3-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "ee559f193bbea7e273755590d5740b492673284100d6d736cd168574c1749801dfd0c67e1a8746841c916c5ca048aed91f5c6b8c0d66cd42424e0ddc02c18a26"

RPROVIDES:${PN} += "libpnetcdf-openmpi3 \
libpnetcdf.so.4 \
libpnetcdf4-openmpi3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
