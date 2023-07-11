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

RPM_NAME = "pnetcdf-openmpi3-devel-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "e1f75e219b3d36df119a14bd09720cdd513b37e6a3b223df7992cb1d5a6c9d325591e8db5a1b007f92b6ce782a6ad56c87d8e38ec49faed0f0e82eec982cf428"

RPROVIDES:${PN} += "parallel-netcdf-openmpi3-devel \
pkgconfig-pnetcdf \
pnetcdf-openmpi3-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-openmpi3 \
openmpi3-devel \
pnetcdf-devel-data"

inherit rpm
