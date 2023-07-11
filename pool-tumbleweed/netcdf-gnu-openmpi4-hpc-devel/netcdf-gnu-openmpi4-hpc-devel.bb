SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi4-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi4-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi4-hpc-devel-4.9.2-1.2.noarch.rpm"
RPM_HASH = "a24d2d3552ba16e4494cd1b924384b41b7655e66a15d65b2b3693d8c291e1010f79d8c604631b1b718bc02ca712846068bc2be71c5f564cb8240d46beb7a806e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-openmpi4-hpc-devel"

inherit rpm
