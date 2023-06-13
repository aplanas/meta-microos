SUMMARY = "Dependency package for gsl_2_7_1-gnu-hpc-devel"
DESCRIPTION = "gsl: GNU Scientific Library \
The package gsl-gnu-hpc-devel provides the dependency to get binary package gsl_2_7_1-gnu-hpc-devel. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-gnu-hpc-devel-2.7.1-1.3.noarch.rpm"
RPM_HASH = "4e3310bfdfb0d72b3a5d10ba0eb63049f688f446faa5f17107facb6f23617ee98f415f844f7077b6111cbf06111ba2b859d5c9690a919a563daa07b3dfbaa5ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-gnu-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
gsl_2_7_1-gnu-hpc-devel"

inherit rpm
