SUMMARY = "Dependency package for libgsl_2_7_1-gnu-hpc"
DESCRIPTION = "gsl: GNU Scientific Library \
The package libgsl-gnu-hpc provides the dependency to get binary package libgsl_2_7_1-gnu-hpc. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libgsl-gnu-hpc-2.7.1-1.4.aarch64.rpm"
RPM_HASH = "cf12bf94079681219a419fbd6600d86b441d76c909823857afa5483f523d02f01ca957fad104b45c786ef4d5579842017c4ec69923bf90f3ecbf5621647461e8"

RPROVIDES:${PN} += "libgsl-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libgsl-2-7-1-gnu-hpc"

inherit rpm
