SUMMARY = "Dependency package for trilinos_14_0_0-gnu-openmpi4-hpc-devel"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package trilinos-gnu-openmpi4-hpc-devel provides the dependency to get binary package trilinos_14_0_0-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-openmpi4-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-gnu-openmpi4-hpc-devel-14.0.0-1.3.noarch.rpm"
RPM_HASH = "f0a83ea560bf6e1b86959ade46d2c31379305da1d63e1f42d293f570a11e6ff343019dba1fedd4382c6012942e3eea356b0d36c249bdb645411be021868d0932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilinos-gnu-openmpi4-hpc \
trilinos-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
trilinos-14-0-0-gnu-openmpi4-hpc-devel"

inherit rpm
