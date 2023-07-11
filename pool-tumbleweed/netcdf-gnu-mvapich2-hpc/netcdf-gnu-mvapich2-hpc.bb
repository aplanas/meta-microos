SUMMARY = "Dependency package for netcdf_4_9_2-gnu-mvapich2-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-mvapich2-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-mvapich2-hpc-4.9.2-1.2.noarch.rpm"
RPM_HASH = "eb5e13031bf828ef9b65ae541d2cf97a9b2e25ad58f649b7888473b7b9aff7ee94c68aa78cebd6d7aff49d3cc34a25884d42f67cf93c9071f196b54725e62607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-mvapich2-hpc"

inherit rpm
