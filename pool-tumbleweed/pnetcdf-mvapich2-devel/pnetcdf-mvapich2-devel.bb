SUMMARY = "Development files for pnetcdf-mvapich2"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the mvapich2 version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-mvapich2-devel-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "b4ab84d4d7fcc0394ef990df25bae0632da58dbb908d86a848e70ca83cb7a5dea5f4812b65cc063a36b986aaaf7d60c56f4ca719846d759b563f21e701980737"

RPROVIDES:${PN} += "parallel-netcdf-mvapich2-devel \
pkgconfig-pnetcdf \
pnetcdf-mvapich2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-mvapich2 \
mvapich2-devel \
pnetcdf-devel-data"

inherit rpm
