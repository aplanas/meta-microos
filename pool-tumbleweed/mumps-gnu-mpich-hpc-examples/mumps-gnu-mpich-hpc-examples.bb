SUMMARY = "Dependency package for mumps_5_3_5-gnu-mpich-hpc-examples"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-mpich-hpc-examples provides the dependency to get binary package mumps_5_3_5-gnu-mpich-hpc-examples. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-mpich-hpc-examples-5.3.5-3.4.noarch.rpm"
RPM_HASH = "8ddcd2e0f8d6d222c3255304a8a3fbbe331a7f0df080d3b28341a024f83a737a48f7d5bf3e46c7f9ab5a82a80336dd786d3bf6e10d5f46d8f4268476a02d1536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-mpich-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-mpich-hpc-examples"

inherit rpm
