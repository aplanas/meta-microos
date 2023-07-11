SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi2-hpc-devel"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi2-hpc-devel provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi2-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi2-hpc-devel-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "683e4632134ce1a24e4252a9bfe5ae9a913d851681f58a086b014eceec6db360a7f31c73d2fecbe13dcd382976b7e40a7f5d3a5280e9b6c862b154583c6cb97d"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-openmpi2-hpc-devel"

inherit rpm
