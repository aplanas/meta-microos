SUMMARY = "Dependency package for gsl_2_7_1-gnu-hpc-doc"
DESCRIPTION = "gsl: GNU Scientific Library \
The package gsl-gnu-hpc-doc provides the dependency to get binary package gsl_2_7_1-gnu-hpc-doc. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-gnu-hpc-doc-2.7.1-2.1.noarch.rpm"
RPM_HASH = "34f42a9961ca679d0366a052558dd5930eaa198f9950cc3029844749b262639210a6416bdc0dc987ed486e9d364d085d911a2af640fb6db449236fde82169ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-gnu-hpc-doc"

RDEPENDS:${PN} += "gsl-2-7-1-gnu-hpc-doc"

inherit rpm
