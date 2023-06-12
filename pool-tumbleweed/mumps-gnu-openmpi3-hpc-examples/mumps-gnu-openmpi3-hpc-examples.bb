SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi3-hpc-examples"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi3-hpc-examples provides the dependency to get binary package mumps_5_3_5-gnu-openmpi3-hpc-examples. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi3-hpc-examples-5.3.5-3.2.noarch.rpm"
RPM_HASH = "cf5fdba1ef9724ca20373263932c07527f303fa0ecabd3b8fa6db3fc3af8d4397b29edc348e5bda216ca75abfcdcf7dbfc3bfbd2b5c3fd0708e76d64cff0dc10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi3-hpc-examples"
RDEPENDS:${PN} += "/bin/sh \
mumps_5_3_5-gnu-openmpi3-hpc-examples"

inherit rpm
