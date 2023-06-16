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

RPM_NAME = "libpnetcdf4-openmpi1-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "3bb52dcfefde143775947a1d410b86d86378057ef38eb61f933fade7f74b3ed7b7624a37b062923e77a264acdaa043b9c081d63b3804845f972ba498cb49a732"

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
