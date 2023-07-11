SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-mvapich2-hpc-devel"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-mvapich2-hpc-devel provides the dependency to get binary package pnetcdf_1_12_3-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-mvapich2-hpc-devel-1.12.3-1.4.noarch.rpm"
RPM_HASH = "efa47ff5d3d3eec55e09e057e757b5a9043c9ca6e12804f50d58d8639d74b20cd6fc856ddc69cafa653cbbe6eb0cb3dad7d4c716cd00e700ec6e6541a5cb0b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-mvapich2-hpc-devel"

inherit rpm
