SUMMARY = "Dependency package for hypre_2_20_0-gnu-mvapich2-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-mvapich2-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mvapich2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-mvapich2-hpc-devel-2.20.0-1.24.noarch.rpm"
RPM_HASH = "5ef5731091ddccecd302e4fdabb4d51f2159b49906d247ab549689711689a6b22004a42a3039799f1c94b000891306318193b4ddeae2437199eb296267b17e09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hypre-2-20-0-gnu-mvapich2-hpc-devel"

inherit rpm
