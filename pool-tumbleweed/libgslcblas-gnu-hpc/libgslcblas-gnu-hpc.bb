SUMMARY = "Dependency package for libgslcblas_2_7_1-gnu-hpc"
DESCRIPTION = "gsl: GNU Scientific Library \
The package libgslcblas-gnu-hpc provides the dependency to get binary package libgslcblas_2_7_1-gnu-hpc. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libgslcblas-gnu-hpc-2.7.1-2.1.aarch64.rpm"
RPM_HASH = "3a92b5b2eab0358b2bafd5af64b5c86e3bf910432ca38c19bdddaacaea06662085b0b8673898c27544358d322953aac73af156d5cbe272ef6ff8944b0dbd7466"

RPROVIDES:${PN} += "libgslcblas-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libgslcblas-2-7-1-gnu-hpc"

inherit rpm
