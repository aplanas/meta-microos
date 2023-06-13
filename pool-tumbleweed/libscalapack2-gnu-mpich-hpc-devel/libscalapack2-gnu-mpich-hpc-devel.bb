SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-mpich-hpc-devel"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-mpich-hpc-devel provides the dependency to get binary package libscalapack2_2_1_0-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-mpich-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-mpich-hpc-devel-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "5227f26e20939f9118a424387f9c470e509724caaec8c512f0de6e0c2c3bea9d07b5a25ec30147371f367372ba89677cf6ef4f39002897b441b5d7adf4a21248"

RPROVIDES:${PN} += "libscalapack2-gnu-mpich-hpc-devel \
libscalapack2-gnu-mpich-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "libscalapack2_2_1_0-gnu-mpich-hpc-devel"

inherit rpm
