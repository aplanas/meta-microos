SUMMARY = "Dependency package for pnetcdf_1_12_3-hpc-doc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-hpc-doc provides the dependency to get binary package pnetcdf_1_12_3-hpc-doc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-hpc-doc-1.12.3-1.5.noarch.rpm"
RPM_HASH = "43ef1033cb001b44b173b41bf746fad920b8aeed814dcf66f82ccebce74cdd7e85c67bdf414246abb6980d1fc4208f4b8d79514c4bef1ce3ec59a80311a972cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-hpc-doc"

RDEPENDS:${PN} += "pnetcdf-1-12-3-hpc-doc"

inherit rpm
