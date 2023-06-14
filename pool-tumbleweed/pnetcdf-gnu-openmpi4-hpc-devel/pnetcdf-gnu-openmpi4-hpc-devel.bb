SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-openmpi4-hpc-devel"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-openmpi4-hpc-devel provides the dependency to get binary package pnetcdf_1_12_3-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-openmpi4-hpc-devel-1.12.3-1.2.noarch.rpm"
RPM_HASH = "0ecd5d8a2f467442821cc84230797395a67b034c88bd2d93e3cc5febb0745d15d476fdc5aaa542ee01c2d2d7e1078cfad40167ef309faac0a662db1d15acb0cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-openmpi4-hpc-devel"

inherit rpm
