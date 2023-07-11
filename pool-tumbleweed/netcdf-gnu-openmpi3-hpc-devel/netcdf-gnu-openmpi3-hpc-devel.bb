SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi3-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi3-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi3-hpc-devel-4.9.2-1.2.noarch.rpm"
RPM_HASH = "08b50ea450c47b3c66b53796710310b5f721a9f259ca63405d38d9e40866f2923aa9c093c190c28dfece0ad8c3ceed56506aa5b5cf51edfc083471ca931b64d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-openmpi3-hpc-devel"

inherit rpm
