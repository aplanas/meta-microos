SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi3-hpc-devel"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi3-hpc-devel provides the dependency to get binary package mumps_5_3_5-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi3-hpc-devel-5.3.5-3.3.noarch.rpm"
RPM_HASH = "ea00f602c4ddd52270333fc3927501322443e6c9a3ca6aefb9a78b8d5f9eedbd77fb4f5bb29e60b3116f98f0fab1486bb1cbdfbcd8cfe3eafd64df3b709adb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-openmpi3-hpc-devel"

inherit rpm
