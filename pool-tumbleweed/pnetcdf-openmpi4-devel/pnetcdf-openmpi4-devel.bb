SUMMARY = "Development files for pnetcdf-openmpi4"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the openmpi version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-openmpi4-devel-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "defd8cc39fb705275d860b86d91b0a120a6518d0804b175d774735a7a28889b7affb710e9d801371884da78256741b7048d96ec15287b07ee4f2a86a1845553b"

RPROVIDES:${PN} += "parallel-netcdf-openmpi4-devel \
pkgconfig-pnetcdf \
pnetcdf-openmpi4-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-openmpi4 \
openmpi4-devel \
pnetcdf-devel-data"

inherit rpm
