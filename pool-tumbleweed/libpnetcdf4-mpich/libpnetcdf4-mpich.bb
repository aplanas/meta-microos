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

RPM_NAME = "libpnetcdf4-mpich-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "68fce7f49c067a0475eac1250ac832e7161f4f9724c880957b79f7de9ef1f3ad40ef358a82aba5c5a5e0e6271dcbcb12177d4561c9e6681619185908720feba5"

RPROVIDES:${PN} += "libpnetcdf-mpich \
libpnetcdf.so.4 \
libpnetcdf4-mpich"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
