SUMMARY = "Module files for gsl_2_7_1-gnu-hpc"
DESCRIPTION = "This package contains the environment module needed for the GSL \
library packages."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl_2_7_1-gnu-hpc-module-2.7.1-1.4.aarch64.rpm"
RPM_HASH = "ed9fe4d29dac05f804c95f3f39a6f754672abf229de385a40b78ea05c325c60751553611b5c2eaf326d24b070b6cb42d251e29da92c91fb540c1db125d2af2eb"

RPROVIDES:${PN} += "gsl-2-7-1-gnu-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
