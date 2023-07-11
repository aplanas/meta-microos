SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-openmpi3-hpc-devel"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-openmpi3-hpc-devel provides the dependency to get binary package pnetcdf_1_12_3-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-openmpi3-hpc-devel-1.12.3-1.3.noarch.rpm"
RPM_HASH = "f4b2be1dd191eca8c11f2ce5d17db55438febe6c92c0b37511a6aa3680a650f77778b88f5a06fb30f96c72ea8cb417a9d0a5e8c4bcb3cf841bb8d2103aecdcb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-openmpi3-hpc-devel"

inherit rpm
