SUMMARY = "Development files for nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains headers and development libraries needed to \
build packages that use the libnco HDF and netCDF library."
LICENSE = "BSD-3-Clause"

PV = "5.1.7"

RPM_NAME = "libnco-devel-5.1.7-1.1.aarch64.rpm"
RPM_HASH = "7f34309d8405197f06366f6bcc3495b8d8120d69569c9d625ed98357abe1351060ac063804c6aefcb0e69180c1c997f85a9a4ab72281a2e74817d0d395313836"

RPROVIDES:${PN} += "libnco-c++-devel \
libnco-devel \
nco-devel"

RDEPENDS:${PN} += "libnco-5-1-7 \
libnco-c++-5-1-7"

inherit rpm
