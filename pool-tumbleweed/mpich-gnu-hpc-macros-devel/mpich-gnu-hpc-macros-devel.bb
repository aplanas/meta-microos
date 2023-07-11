SUMMARY = "Dependency package for mpich_4_0_2-gnu-hpc-macros-devel"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-gnu-hpc-macros-devel provides the dependency to get binary package mpich_4_0_2-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of mpich_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-gnu-hpc-macros-devel-4.0.2-3.4.noarch.rpm"
RPM_HASH = "0e21c1dc9a6d41bb152f282120d41020ab5b8954797c742af337b6ab919d687599e454734d6a9efef41497aea00ae05f9f6383fa8577cf7432cb6b366952d8cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpich-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "mpich-4-0-2-gnu-hpc-macros-devel"

inherit rpm
