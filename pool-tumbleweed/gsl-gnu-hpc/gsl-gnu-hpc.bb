SUMMARY = "Dependency package for gsl_2_7_1-gnu-hpc"
DESCRIPTION = "gsl: GNU Scientific Library \
The package gsl-gnu-hpc provides the dependency to get binary package gsl_2_7_1-gnu-hpc. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-gnu-hpc-2.7.1-1.3.noarch.rpm"
RPM_HASH = "bf193aeb6f2da27a48c64b87c8d09a0941587ed7d22201a71c5afd5926c8127de7f01c0a63738b157ebfd2633cb62bec4170553bca64bdfe74ef2ce2d6fa9e88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-gnu-hpc"

RDEPENDS:${PN} += "gsl-2-7-1-gnu-hpc"

inherit rpm
