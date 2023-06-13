SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi3-hpc-doc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi3-hpc-doc provides the dependency to get binary package mumps_5_3_5-gnu-openmpi3-hpc-doc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi3-hpc-doc-5.3.5-3.2.noarch.rpm"
RPM_HASH = "655b32b238179d03373caed493fca39aee0085f3db07b7811734ed52337514255db8e3892e2761fa6e92cc96d675d0215d839c36dfd0b04086e23e608003e7f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi3-hpc-doc"

RDEPENDS:${PN} += "mumps_5_3_5-gnu-openmpi3-hpc-doc"

inherit rpm
