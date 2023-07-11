SUMMARY = "Dependency package for gsl_2_7_1-gnu-hpc-devel"
DESCRIPTION = "gsl: GNU Scientific Library \
The package gsl-gnu-hpc-devel provides the dependency to get binary package gsl_2_7_1-gnu-hpc-devel. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-gnu-hpc-devel-2.7.1-1.4.noarch.rpm"
RPM_HASH = "c11895c70c70d7a24695a57d64b4865c260059abc2bcd0c685311a2e13fc32d84056922a16aff9d5fb91de964b9c325df2ec9ff70952b411d8caeae9e3200f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gsl-2-7-1-gnu-hpc-devel"

inherit rpm
