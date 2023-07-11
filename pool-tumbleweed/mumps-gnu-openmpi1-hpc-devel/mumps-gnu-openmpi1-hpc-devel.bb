SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi1-hpc-devel"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi1-hpc-devel provides the dependency to get binary package mumps_5_3_5-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi1-hpc-devel-5.3.5-3.4.noarch.rpm"
RPM_HASH = "89801544d2a932b0035547d0dbfb0386d4838468aba6f65dc3ed250d0a2cacfc0a325fa116835a930d38272908485c2cfe942695eaadb5bbd8984ed7c11cede6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-openmpi1-hpc-devel"

inherit rpm
