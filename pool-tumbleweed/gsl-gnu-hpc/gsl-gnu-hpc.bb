SUMMARY = "Dependency package for gsl_2_7_1-gnu-hpc"
DESCRIPTION = "gsl: GNU Scientific Library \
The package gsl-gnu-hpc provides the dependency to get binary package gsl_2_7_1-gnu-hpc. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-gnu-hpc-2.7.1-1.4.noarch.rpm"
RPM_HASH = "9bf75845392273d5173a68da55a0758531d60f0a14ef7e814e9e1c8eb922dcc8f0881bca9823caccac87a87d02ffec491aeb9ae21dd9ae0ce8797cbca0209c12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-gnu-hpc"

RDEPENDS:${PN} += "gsl-2-7-1-gnu-hpc"

inherit rpm
