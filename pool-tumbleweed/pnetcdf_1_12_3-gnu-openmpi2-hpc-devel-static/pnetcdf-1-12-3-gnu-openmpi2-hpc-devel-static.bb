SUMMARY = "Static development files for pnetcdf_1_12_3-gnu-openmpi2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi2-hpc-devel-static-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "e3c3d9241ca4cb65b13e7c6c6e52c1d6257d8f1ff2a548dbad9d9753f75f7f2366f1821efa67a127fe8426e5e77256779d762dec94a7a9e64a03f0dfca6ad4a8"

RPROVIDES:${PN} += "pnetcdf-1-12-3-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-openmpi2-hpc-devel"

inherit rpm
