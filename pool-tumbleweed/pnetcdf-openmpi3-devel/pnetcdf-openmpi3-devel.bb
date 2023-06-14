SUMMARY = "Development files for pnetcdf-openmpi3"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the openmpi version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-openmpi3-devel-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "a39062e328d200e8ffdd5681e62c2d8fec29cd88936621702b5cb34c8a42d180d70b71e4381b84f49981a20f30c5140f57b427c46471cfae33d0138e9fed88f5"

RPROVIDES:${PN} += "parallel-netcdf-openmpi3-devel \
pkgconfig-pnetcdf \
pnetcdf-openmpi3-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-openmpi3 \
openmpi3-devel \
pnetcdf-devel-data"

inherit rpm
