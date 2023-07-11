SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi2-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi2-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi2-hpc-devel-4.9.2-1.2.noarch.rpm"
RPM_HASH = "492e816a33c41835b209e72f8c0887822be85faca1a128e64f87b53ee77c4d00c0b5644f8822c03fba0f7448ce1b4bd5f944b7d6b54e7c2267355d90ebe3ea27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-openmpi2-hpc-devel"

inherit rpm
