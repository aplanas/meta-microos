SUMMARY = "Development files for pnetcdf_1_12_3-gnu-openmpi3-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the openmpi version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi3-hpc-devel-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "53c3783237218fe2c2bb489823c8242c8769692d7cfc370c081cc85d1f92e50d2a79314f4377b87e5b62ba88ec8ddf633d1d6b75020e0b9bca7ea7f8228235d7"

RPROVIDES:${PN} += "pkgconfig-pnetcdf \
pnetcdf-1-12-3-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libpnetcdf-1-12-3-gnu-openmpi3-hpc \
libstdc++.so.6 \
openmpi3-gnu-hpc-devel"

inherit rpm
