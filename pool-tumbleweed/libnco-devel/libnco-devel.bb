SUMMARY = "Development files for nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains headers and development libraries needed to \
build packages that use the libnco HDF and netCDF library."
LICENSE = "BSD-3-Clause"

PV = "5.1.4"

RPM_NAME = "libnco-devel-5.1.4-1.6.aarch64.rpm"
RPM_HASH = "379c3249a2dda8a3d5313b667372d9533700c4c8913339474d5d7449c1af25b7cfd9a948ce6f8f1b7e7eb01d8f43fdd1366a5ac813d838245e1cac805eb5723e"

RPROVIDES:${PN} += "libnco-c++-devel \
libnco-devel \
nco-devel"

RDEPENDS:${PN} += "libnco-5-1-4 \
libnco-c++-5-1-4"

inherit rpm
