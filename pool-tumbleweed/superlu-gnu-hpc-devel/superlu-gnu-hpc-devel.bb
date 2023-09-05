SUMMARY = "Dependency package for superlu_6_0_1-gnu-hpc-devel"
DESCRIPTION = "superlu: A general purpose library for the direct solution of linear equations \
The package superlu-gnu-hpc-devel provides the dependency to get binary package superlu_6_0_1-gnu-hpc-devel. \
When this package gets updated it installs the latest version of superlu_6_0_1-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "6.0.1"

RPM_NAME = "superlu-gnu-hpc-devel-6.0.1-1.1.noarch.rpm"
RPM_HASH = "3ad550bb8abf1ee40d743d7b9627d473c1c63a0fbbc16500ee9c6030a1fb5892f2f892422f046eb162a699f6875c548d309ca968927a5e300660632fe2209e3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
superlu-6-0-1-gnu-hpc-devel"

inherit rpm
