SUMMARY = "Development files for pnetcdf-openmpi1"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the openmpi version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-openmpi1-devel-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "30cf6132317dbee0bef5b8a95c470b4c69e90c8814b1ab8276db143fc075cfab3f3189b8e9be5ff09bbee261da11180e62fd42102b3ac7c2e0d977123ef3a00a"

RPROVIDES:${PN} += "parallel-netcdf-openmpi1-devel \
pkgconfig-pnetcdf \
pnetcdf-openmpi1-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-openmpi1 \
openmpi1-devel \
pnetcdf-devel-data"

inherit rpm
