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

RPM_NAME = "libpnetcdf4-openmpi4-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "93f08758e1e10eaa90d341169a46b9406a97d948c08089775e951fb60398cf2efb030b6614a5083fef0ec6dbdc89e3ffdfd125a515b72beb2924b9ea6f55ec3e"

RPROVIDES:${PN} += "libpnetcdf-openmpi4 \
libpnetcdf.so.4 \
libpnetcdf4-openmpi4"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
