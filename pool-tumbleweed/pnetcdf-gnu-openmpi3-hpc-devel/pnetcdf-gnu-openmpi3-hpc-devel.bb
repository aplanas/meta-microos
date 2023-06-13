SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-openmpi3-hpc-devel"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-openmpi3-hpc-devel provides the dependency to get binary package pnetcdf_1_12_3-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-openmpi3-hpc-devel-1.12.3-1.2.noarch.rpm"
RPM_HASH = "ff948a59c222c005c131785ca53b8ee5d8dfe15d0f1951ddf98fb7471adaec3ebdf9bfbcd1be2a127d82ef961795d81e2b7889abebc9147ef6f02156e13cd09e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "pnetcdf_1_12_3-gnu-openmpi3-hpc-devel"

inherit rpm
