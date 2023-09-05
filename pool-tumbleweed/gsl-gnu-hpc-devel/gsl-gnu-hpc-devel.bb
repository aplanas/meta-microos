SUMMARY = "Dependency package for gsl_2_7_1-gnu-hpc-devel"
DESCRIPTION = "gsl: GNU Scientific Library \
The package gsl-gnu-hpc-devel provides the dependency to get binary package gsl_2_7_1-gnu-hpc-devel. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-gnu-hpc-devel-2.7.1-2.1.noarch.rpm"
RPM_HASH = "6efef878e96142c04f5a00e831df9236e95aedc71ba13d361576e263d8f7a2ed14c2d70f3fd790519ba136010d31d8dc2cf5e4effd1beffd7fc315bb1cd87fff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gsl-2-7-1-gnu-hpc-devel"

inherit rpm
