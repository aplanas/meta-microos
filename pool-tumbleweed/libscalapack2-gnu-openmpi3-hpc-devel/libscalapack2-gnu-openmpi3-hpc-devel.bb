SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi3-hpc-devel"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi3-hpc-devel provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi3-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi3-hpc-devel-2.1.0-9.18.aarch64.rpm"
RPM_HASH = "287d68dfceb19840717c44cab0516d0d4b595056017be5f85476e04a43824618df43142c5aa6dff14de1a86ca2273b639644e50047aaa6fd910bf7799ab67a43"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi3-hpc-devel \
libscalapack2-gnu-openmpi3-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "libscalapack2_2_1_0-gnu-openmpi3-hpc-devel"

inherit rpm
