SUMMARY = "Dependency package for mumps_5_3_5-gnu-mpich-hpc-examples"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-mpich-hpc-examples provides the dependency to get binary package mumps_5_3_5-gnu-mpich-hpc-examples. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-mpich-hpc-examples-5.3.5-3.3.noarch.rpm"
RPM_HASH = "78bb5b4e036ae68d626b3ff1af16eb7c4aae4dab1f8267a6aecbb5cbb041ddcbf3c11df44d8205c4ee89af31d99a495736bec518e44587790d69d54e6271535f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-mpich-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-mpich-hpc-examples"

inherit rpm
