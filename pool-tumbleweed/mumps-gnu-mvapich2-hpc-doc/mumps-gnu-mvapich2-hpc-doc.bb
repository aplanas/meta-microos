SUMMARY = "Dependency package for mumps_5_3_5-gnu-mvapich2-hpc-doc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-mvapich2-hpc-doc provides the dependency to get binary package mumps_5_3_5-gnu-mvapich2-hpc-doc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-mvapich2-hpc-doc-5.3.5-3.3.noarch.rpm"
RPM_HASH = "11f30cf833aae1411c1f176802b9c00bac678eb532d5210aa3b8fd85683d9c80298d0767736e8394ea9dbf87feaf97c05c548672b516063203d8b068ac818d4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-mvapich2-hpc-doc"

RDEPENDS:${PN} += "mumps_5_3_5-gnu-mvapich2-hpc-doc"

inherit rpm
