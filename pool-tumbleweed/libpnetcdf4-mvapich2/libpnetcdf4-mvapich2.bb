SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mvapich2 version of the PnetCDF runtime \
libraries."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf4-mvapich2-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "8b4220a9f47c995ee5db82feadec784c8bac4ba7b8954d3d1d593f9c48bf0f29f71cc9cf62c257cfb60f2023198d57dfa41320b82b6bcbc582948a421e09643e"

RPROVIDES:${PN} += "libpnetcdf-mvapich2 \
libpnetcdf.so.4 \
libpnetcdf4-mvapich2"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
