SUMMARY = "Dependency package for trilinos_13_2_0-gnu-mpich-hpc-devel"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package trilinos-gnu-mpich-hpc-devel provides the dependency to get binary package trilinos_13_2_0-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of trilinos_13_2_0-gnu-mpich-hpc."
LICENSE = "LGPL-2.0-only"

PV = "13.2.0"

RPM_NAME = "trilinos-gnu-mpich-hpc-devel-13.2.0-5.3.noarch.rpm"
RPM_HASH = "62fae04d6207c59c53af2249d35a5a3327c5065aee1fea17dcc322a1c83209955b50b77f8367c6c5cf76a73672a23e3b29742fbabf1e58051b5ea196665d2ce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilinos-gnu-mpich-hpc \
trilinos-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
trilinos-13-2-0-gnu-mpich-hpc-devel"

inherit rpm
