SUMMARY = "Documentation for pnetcdf"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the documentation for PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-doc-1.12.3-1.5.noarch.rpm"
RPM_HASH = "3364255c8751c0671199695b053092c3f2d15b88c1f6091cd9984fadaf67e61b5a4ffe7eee0bd0ca7a514c5c9b7547771ac3cc8bff924afe413d3262c5da308f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
