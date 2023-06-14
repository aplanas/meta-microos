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

RPM_NAME = "pnetcdf-openmpi1-devel-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "503bb9161f728476554a8ad85b50d75f52b6406295d50beefbe5b3237acbf6fbfd24415864b365da4f0d9c02af8973ebc4d097e9d4cdf387f4b42468c08a69cb"

RPROVIDES:${PN} += "parallel-netcdf-openmpi1-devel \
pkgconfig-pnetcdf \
pnetcdf-openmpi1-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-openmpi1 \
openmpi1-devel \
pnetcdf-devel-data"

inherit rpm
