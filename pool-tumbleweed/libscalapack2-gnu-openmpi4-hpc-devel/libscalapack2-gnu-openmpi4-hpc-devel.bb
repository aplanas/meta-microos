SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi4-hpc-devel"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi4-hpc-devel provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi4-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi4-hpc-devel-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "e55c483d87b18b97cb950987bf0c3c65d797a2b549e5376832ea37111d823a5412ac1b83a99f4152ee3963fb72ef3df5c638d79027b661a46e72d8f2b26aacb5"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-openmpi4-hpc-devel"

inherit rpm
