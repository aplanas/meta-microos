SUMMARY = "Dependency package for mumps_5_3_5-gnu-mpich-hpc-doc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-mpich-hpc-doc provides the dependency to get binary package mumps_5_3_5-gnu-mpich-hpc-doc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-mpich-hpc-doc-5.3.5-3.3.noarch.rpm"
RPM_HASH = "79ec3fea91842630832d2af4d3b7f76ec3fbc55b8bb71b4a16358fe5b5d58555a509772fd15485a97e8ff46579c089c4c37c8e5cb24d99452428aad8679005eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-mpich-hpc-doc"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-mpich-hpc-doc"

inherit rpm
