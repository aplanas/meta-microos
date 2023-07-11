SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi1-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi1-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi1-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi1-hpc-devel-4.9.2-1.2.noarch.rpm"
RPM_HASH = "6ef1ab61f7fe2d7f12589d04d2a1d6bed1e258811f41db49d74edf2294c4a1439610d15ce346324a1af1c4876520e1381a1456ceb6232f4fb7a878bdaac38fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-openmpi1-hpc-devel"

inherit rpm
