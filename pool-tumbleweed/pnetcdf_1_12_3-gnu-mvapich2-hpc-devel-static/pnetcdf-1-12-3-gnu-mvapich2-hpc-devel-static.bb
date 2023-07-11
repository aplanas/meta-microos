SUMMARY = "Static development files for pnetcdf_1_12_3-gnu-mvapich2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mvapich2 versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-mvapich2-hpc-devel-static-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "59867a8d973a66764ef8f26f9d8632e85663608dd6ff56b4e44955fb6005c95e55f64dd869822cd5f729a6868a8c6bb92970ab99cc4845f687baac6de8c71dec"

RPROVIDES:${PN} += "pnetcdf-1-12-3-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-mvapich2-hpc-devel"

inherit rpm
