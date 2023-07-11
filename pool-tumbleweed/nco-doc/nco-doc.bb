SUMMARY = "Documentation for nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains the documentation for nco."
LICENSE = "BSD-3-Clause"

PV = "5.1.4"

RPM_NAME = "nco-doc-5.1.4-1.6.noarch.rpm"
RPM_HASH = "c3b31f6cca0fb450c5fea23a6de01ac9d78b295d59e9ec50004907f7f39fb725bfa831597f261be65ecae1b42c80fea8c0fb9bd047735c4c1b856829505ad16e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nco-doc"

RDEPENDS:${PN} += ""

inherit rpm
