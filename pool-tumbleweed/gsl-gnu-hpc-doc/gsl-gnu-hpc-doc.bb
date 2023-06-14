SUMMARY = "Dependency package for gsl_2_7_1-gnu-hpc-doc"
DESCRIPTION = "gsl: GNU Scientific Library \
The package gsl-gnu-hpc-doc provides the dependency to get binary package gsl_2_7_1-gnu-hpc-doc. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-gnu-hpc-doc-2.7.1-1.3.noarch.rpm"
RPM_HASH = "cd6e4ee4f2915036a7fdc45a9b9a8c7ccd467aaeda431ec79c8960afcf576d9ec435992c216c884a72555186b8367f928a630f57f30df86e5f5d82c69d637026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-gnu-hpc-doc"

RDEPENDS:${PN} += "gsl-2-7-1-gnu-hpc-doc"

inherit rpm
