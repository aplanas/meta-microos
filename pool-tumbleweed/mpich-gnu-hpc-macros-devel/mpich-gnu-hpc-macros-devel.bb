SUMMARY = "Dependency package for mpich_4_0_2-gnu-hpc-macros-devel"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-gnu-hpc-macros-devel provides the dependency to get binary package mpich_4_0_2-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of mpich_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-gnu-hpc-macros-devel-4.0.2-3.3.noarch.rpm"
RPM_HASH = "7ce5c49d6c04013ef6aa3ca06cb43fc6a779d1727c0bfa4b91836a2242ab76b97c79d08391dbb34287128fd4fa661a0a0aad3eb3b9d38b3510f2c24fc5a73858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpich-gnu-hpc-macros-devel"
RDEPENDS:${PN} += "mpich_4_0_2-gnu-hpc-macros-devel"

inherit rpm
