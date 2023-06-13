SUMMARY = "Dependency package for superlu_6_0_0-gnu-hpc-examples"
DESCRIPTION = "superlu: A general purpose library for the direct solution of linear equations \
The package superlu-gnu-hpc-examples provides the dependency to get binary package superlu_6_0_0-gnu-hpc-examples. \
When this package gets updated it installs the latest version of superlu_6_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "6.0.0"

RPM_NAME = "superlu-gnu-hpc-examples-6.0.0-2.1.noarch.rpm"
RPM_HASH = "4e0d6e3d35fec8be291eff4b23530ffee2eebd9661f49a960ea10c3e159c695693f79f31d414f15a3181b13ff59f8d506a38bafdff7176f52b7183b8a38273f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-gnu-hpc-examples"

RDEPENDS:${PN} += "/bin/sh \
superlu_6_0_0-gnu-hpc-examples"

inherit rpm
