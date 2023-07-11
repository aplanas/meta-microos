SUMMARY = "Documentation for pnetcdf"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the documentation for PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-hpc-doc-1.12.3-1.5.noarch.rpm"
RPM_HASH = "0050bb63e971ec9268255c66c14f080787abbdc80bb23cfd29bb23032883c84ed01f2b4141447db674e486f7d69edc9c1c3c83884880d21f4649051c24156965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-1-12-3-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
