SUMMARY = "Dependency package for libgslcblas_2_7_1-gnu-hpc"
DESCRIPTION = "gsl: GNU Scientific Library \
The package libgslcblas-gnu-hpc provides the dependency to get binary package libgslcblas_2_7_1-gnu-hpc. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libgslcblas-gnu-hpc-2.7.1-1.4.aarch64.rpm"
RPM_HASH = "bc0af875954633d5645a5429fa105826634acb0b050e3754010dbf52d96c59258a9886c17f88dfb480819ec7db30957f1df5a1c704ca7cf1284cb56d16ba8bbb"

RPROVIDES:${PN} += "libgslcblas-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libgslcblas-2-7-1-gnu-hpc"

inherit rpm
