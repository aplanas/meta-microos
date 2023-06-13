SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-mvapich2-hpc-devel"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-mvapich2-hpc-devel provides the dependency to get binary package pnetcdf_1_12_3-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-mvapich2-hpc-devel-1.12.3-1.3.noarch.rpm"
RPM_HASH = "5f41e4b673651757043e1d1439627ca267530c18d18455a33991b10309179128b37cb877e5a5d297eb5eb49d9fc4bea6360e97a034292c74f44244fce216ce36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "pnetcdf_1_12_3-gnu-mvapich2-hpc-devel"

inherit rpm
