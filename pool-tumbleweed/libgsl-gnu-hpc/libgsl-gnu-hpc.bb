SUMMARY = "Dependency package for libgsl_2_7_1-gnu-hpc"
DESCRIPTION = "gsl: GNU Scientific Library \
The package libgsl-gnu-hpc provides the dependency to get binary package libgsl_2_7_1-gnu-hpc. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libgsl-gnu-hpc-2.7.1-2.1.aarch64.rpm"
RPM_HASH = "8241c94905c0b1305b9a4d5b97ec2cc3d5512e7c0a785327896683f017173ecfd2cabc1a0380c508707bc0b93300951fcc96d44d37f3502c9dd04d5ce8dccf91"

RPROVIDES:${PN} += "libgsl-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libgsl-2-7-1-gnu-hpc"

inherit rpm
