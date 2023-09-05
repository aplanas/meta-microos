SUMMARY = "Module files for gsl_2_7_1-gnu-hpc"
DESCRIPTION = "This package contains the environment module needed for the GSL \
library packages."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl_2_7_1-gnu-hpc-module-2.7.1-2.1.aarch64.rpm"
RPM_HASH = "ca5e0b73b795c920adaddba6271cbac14cb123b4d3d404a78f2b1e429d66ade5dcce44c2391b33573c2d9e500540311808568ac1854e59574eea1f6aaf30a873"

RPROVIDES:${PN} += "gsl-2-7-1-gnu-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
