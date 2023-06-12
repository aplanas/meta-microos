SUMMARY = "Dependency package for superlu_6_0_0-gnu-hpc-devel"
DESCRIPTION = "superlu: A general purpose library for the direct solution of linear equations \
The package superlu-gnu-hpc-devel provides the dependency to get binary package superlu_6_0_0-gnu-hpc-devel. \
When this package gets updated it installs the latest version of superlu_6_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "6.0.0"

RPM_NAME = "superlu-gnu-hpc-devel-6.0.0-2.1.noarch.rpm"
RPM_HASH = "906dfc0eeb3bdc1b2b992578e29d8b60278c2f2c97fdd5e3b9f66efbe0ebfcdad6cd595b851d91a6ad340fb19c15ea53f4e268cabc98a27de16e54e18dd34b79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-gnu-hpc-devel"
RDEPENDS:${PN} += "/bin/sh \
superlu_6_0_0-gnu-hpc-devel"

inherit rpm
