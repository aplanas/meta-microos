SUMMARY = "Module files for gsl_2_7_1-gnu-hpc"
DESCRIPTION = "This package contains the environment module needed for the GSL \
library packages."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl_2_7_1-gnu-hpc-module-2.7.1-1.3.aarch64.rpm"
RPM_HASH = "e9b35b5b5c7f795a1113994987ad234846faf033942be32a020bd0bf7549f8cb78dac6bac2900351088fdbef7ee6e5bd2bb9c3b4ef1dcfadf78deda4b990db2c"

RPROVIDES:${PN} += "gsl-2-7-1-gnu-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
