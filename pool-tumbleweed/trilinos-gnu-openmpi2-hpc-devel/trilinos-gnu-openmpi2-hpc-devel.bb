SUMMARY = "Dependency package for trilinos_14_0_0-gnu-openmpi2-hpc-devel"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package trilinos-gnu-openmpi2-hpc-devel provides the dependency to get binary package trilinos_14_0_0-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-openmpi2-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-gnu-openmpi2-hpc-devel-14.0.0-1.3.noarch.rpm"
RPM_HASH = "5496c6a660e1082e1805113af8f1cbdf31b090bd1c14396031811f0c6de0acb81b4e834c1633c5c2a1209321a9461c8b250d5dac3403f428c7c29d4e6e3031aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilinos-gnu-openmpi2-hpc \
trilinos-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
trilinos-14-0-0-gnu-openmpi2-hpc-devel"

inherit rpm
