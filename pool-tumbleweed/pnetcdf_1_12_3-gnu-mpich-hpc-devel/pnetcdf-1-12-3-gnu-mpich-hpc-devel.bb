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

RPM_NAME = "pnetcdf_1_12_3-gnu-mpich-hpc-devel-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "806793f2f7338778f215ec9151560f2fbdd796f4c307078ebf0fc957082933137dc6d0f276c4a919d33c94b2b34bf5b48131b0084ee2b1962597b3ccea6fc9b0"

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
