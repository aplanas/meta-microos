SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-openmpi4-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-openmpi4-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-openmpi4-hpc-devel-4.5.3-4.5.noarch.rpm"
RPM_HASH = "9b67028290816d0badd58fdd6dae63dab17cea058259f2f7c66378b1496aaea54772fe5709c843f2f5fcba776d6a0894cc59ca295a48398adfa094a5fa12d39e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-openmpi4-hpc \
netcdf-fortran-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "netcdf-fortran-4-5-3-gnu-openmpi4-hpc-devel"

inherit rpm
