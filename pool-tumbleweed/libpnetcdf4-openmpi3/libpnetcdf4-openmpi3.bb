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

RPM_NAME = "libpnetcdf4-openmpi3-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "b9f9913c5ab4cccc7c35cbc5e38747de025f044a90810b9fcaa026b38cce8eba2e30e2e96d370cb67817eb7e6813b84853bc15f051eea31494da3f0282bc4ed9"

RPROVIDES:${PN} += "libpnetcdf-openmpi3 \
libpnetcdf.so.4 \
libpnetcdf4-openmpi3"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
