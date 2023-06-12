SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "67c0c10279e7ef86b29d3594c1526bd31aef31abd0419b9193a8c81173ba6079e36211a6eee65eaed771781e7ed14151f0679dc7cef8ba1e07e232d0712c76e3"

RPROVIDES:${PN} += "libnetcdf-gnu-hpc \
libnetcdf-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libnetcdf_4_9_2-gnu-hpc"

inherit rpm
