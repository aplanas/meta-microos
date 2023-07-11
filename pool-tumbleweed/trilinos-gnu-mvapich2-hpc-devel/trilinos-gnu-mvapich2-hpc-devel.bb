SUMMARY = "Dependency package for trilinos_14_0_0-gnu-mvapich2-hpc-devel"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package trilinos-gnu-mvapich2-hpc-devel provides the dependency to get binary package trilinos_14_0_0-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-mvapich2-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-gnu-mvapich2-hpc-devel-14.0.0-1.2.noarch.rpm"
RPM_HASH = "2c6453613b9d2847e12d4490ad067565411d9561414e0d191312b6f64696c00333f01e3f914c99f323636ec7798424a52ad80e2742e7d04415eb6c330d9d8d06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilinos-gnu-mvapich2-hpc \
trilinos-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
trilinos-14-0-0-gnu-mvapich2-hpc-devel"

inherit rpm
