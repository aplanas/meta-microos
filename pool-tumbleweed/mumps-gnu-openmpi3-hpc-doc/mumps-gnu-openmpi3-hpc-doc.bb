SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi3-hpc-doc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi3-hpc-doc provides the dependency to get binary package mumps_5_3_5-gnu-openmpi3-hpc-doc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi3-hpc-doc-5.3.5-3.3.noarch.rpm"
RPM_HASH = "d1a6c365b792fc3d07fff77cf21020a860737568aba4e275003fd869825ddb762055bff1459d87f479863e26e926044c3c1a8893c5f4d6abaea0957e9ed54068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi3-hpc-doc"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-openmpi3-hpc-doc"

inherit rpm
