SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi4-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi4-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi4-hpc-devel-4.9.2-1.1.noarch.rpm"
RPM_HASH = "c038297e0404ee2f6d52bfddbbce82dd324fa1c9d28cf7e9b3b59f0545f7aad72c5f6e57f34eaf5bda0589981a99426277e09f2e419bbdb4dda5d8290e7d0041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi4-hpc-devel"
RDEPENDS:${PN} += "netcdf_4_9_2-gnu-openmpi4-hpc-devel"

inherit rpm
