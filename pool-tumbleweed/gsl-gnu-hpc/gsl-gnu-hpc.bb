SUMMARY = "Dependency package for gsl_2_7_1-gnu-hpc"
DESCRIPTION = "gsl: GNU Scientific Library \
The package gsl-gnu-hpc provides the dependency to get binary package gsl_2_7_1-gnu-hpc. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-gnu-hpc-2.7.1-2.1.noarch.rpm"
RPM_HASH = "770998a6367aecc632aa7e1c81122189d0551561ba41b5d37a4ab4d13f7cba40e1b945af32310a8d8c65041398bb2120f01b3ab8aecbb2ebfee8416aad627315"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-gnu-hpc"

RDEPENDS:${PN} += "gsl-2-7-1-gnu-hpc"

inherit rpm
