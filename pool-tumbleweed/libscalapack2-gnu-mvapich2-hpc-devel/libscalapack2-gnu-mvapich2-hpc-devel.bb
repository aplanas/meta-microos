SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-mvapich2-hpc-devel"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-mvapich2-hpc-devel provides the dependency to get binary package libscalapack2_2_1_0-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-mvapich2-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-mvapich2-hpc-devel-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "f6b906a511959ce1be9337ca069c586e1a29c1ccb3a745544cbdff96a1c197d355491deea7baa88ac53e818d8a76a5056f54061a241ac1659a52ea5e3ffac5a0"

RPROVIDES:${PN} += "libscalapack2-gnu-mvapich2-hpc-devel \
libscalapack2-gnu-mvapich2-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "libscalapack2_2_1_0-gnu-mvapich2-hpc-devel"

inherit rpm
