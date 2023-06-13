SUMMARY = "Documentation for pnetcdf"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the documentation for PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-hpc-doc-1.12.3-1.3.noarch.rpm"
RPM_HASH = "c1ff96c494a51578e524c8a719a020b063ef7c5784b180be9ffb8471ad1b90dd8ca83b63a25afb08ba321174558e637083c163327c33f599044d394ab72bb615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf_1_12_3-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
