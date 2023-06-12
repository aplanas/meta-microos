SUMMARY = "Development files for nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains headers and development libraries needed to \
build packages that use the libnco HDF and netCDF library."
LICENSE = "BSD-3-Clause"

PV = "5.1.4"

RPM_NAME = "libnco-devel-5.1.4-1.4.aarch64.rpm"
RPM_HASH = "5905357af6169a88d7b134285daf342c02ba278e6ad7db1e5f4710013d027dcb2e686362cb113431394837dcad67698229513ccf3b0e3bdb263f6b698cfb6148"

RPROVIDES:${PN} += "libnco-devel \
libnco-devel(aarch-64) \
libnco_c++-devel \
nco-devel"
RDEPENDS:${PN} += "libnco-5_1_4 \
libnco_c++-5_1_4"

inherit rpm
