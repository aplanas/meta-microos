SUMMARY = "Dependency package for gsl_2_7_1-gnu-hpc-doc"
DESCRIPTION = "gsl: GNU Scientific Library \
The package gsl-gnu-hpc-doc provides the dependency to get binary package gsl_2_7_1-gnu-hpc-doc. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-gnu-hpc-doc-2.7.1-1.4.noarch.rpm"
RPM_HASH = "b8926420a0d27f5970c8796e2b5e14d8ca6071348b9b34d52842c39b327834778e19c521099f7fa91f937dc2efd759e84c0df1d56ddde249b6ec2878ff918a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-gnu-hpc-doc"

RDEPENDS:${PN} += "gsl-2-7-1-gnu-hpc-doc"

inherit rpm
