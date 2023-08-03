SUMMARY = "Dependency package for trilinos_14_0_0-gnu-mpich-hpc-devel"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package trilinos-gnu-mpich-hpc-devel provides the dependency to get binary package trilinos_14_0_0-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-mpich-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-gnu-mpich-hpc-devel-14.0.0-1.1.noarch.rpm"
RPM_HASH = "64b709a4a88f7c6aef490b043b91efdf72c78b59dafa1c28a34245716920dfdf793d00c16840e08146311c3f43b4d47fd41cae0792a866b3a8306bdafa14d93b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilinos-gnu-mpich-hpc \
trilinos-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
trilinos-14-0-0-gnu-mpich-hpc-devel"

inherit rpm
