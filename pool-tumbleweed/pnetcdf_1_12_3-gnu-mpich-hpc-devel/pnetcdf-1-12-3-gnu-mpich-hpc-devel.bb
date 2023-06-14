SUMMARY = "Development files for pnetcdf_1_12_3-gnu-mpich-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the mpich version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-mpich-hpc-devel-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "a4ea81f9350ef5179ad91f1b78e6d43342d7a62613adbbf80a362683004f9bfcdbc4725b781ea81b5e883206240a6865387837b07b7e39bdce08ba619fd58c68"

RPROVIDES:${PN} += "pkgconfig-pnetcdf \
pnetcdf-1-12-3-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libpnetcdf-1-12-3-gnu-mpich-hpc \
libstdc++.so.6 \
mpich-gnu-hpc-devel"

inherit rpm
