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

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi3-hpc-devel-1.12.3-1.2.aarch64.rpm"
RPM_HASH = "e38638744cb77f9f5aa2efd3d899d212c785b72f8a85e4f8d74f0ff2547bc173f1d778daa6106fa46443113c435d56675eb7dc3f58df37fc8dc462ef1cdc411f"

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
