SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-mpich-hpc-devel"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-mpich-hpc-devel provides the dependency to get binary package libscalapack2_2_1_0-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-mpich-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-mpich-hpc-devel-2.1.0-9.21.aarch64.rpm"
RPM_HASH = "aa0bdbf40fcd6db19605b4026a85354e0e49e3048eabb1406c649a475b6a8e68115bd2b7c207f542afe798dbc8d8584caeccc5a48571a3f7fed734e72385ec0a"

RPROVIDES:${PN} += "libscalapack2-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-mpich-hpc-devel"

inherit rpm
