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

RPM_NAME = "libpnetcdf_1_12_3-gnu-openmpi2-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "a7f4606e5ee925b21719ef2b5eb6fbbe9a2c97a42fe5a79854de4ec5c6e1fa18142d7598f4b56fc97eac5ef6a67a96c39993dab917131050e47c9074744b3174"

RPROVIDES:${PN} += "libpnetcdf_1_12_3-gnu-openmpi2-hpc \
libpnetcdf_1_12_3-gnu-openmpi2-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libopenmpi2-gnu-hpc \
libstdc++.so.6()(64bit) \
lua-lmod"

inherit rpm
