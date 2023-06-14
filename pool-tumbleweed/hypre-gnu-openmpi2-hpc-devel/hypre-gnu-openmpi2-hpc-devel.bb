SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi2-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi2-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi2-hpc-devel-2.20.0-1.22.noarch.rpm"
RPM_HASH = "cf519a07e38fa6d29b17030ff4e6377b4f8ee74ead9e4b8af32a6aa44a518fec86ec2b8e37e4c52756e1ea0ad4b5b4ce2b4f2402732397dae3b203a5589917f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
hypre-2-20-0-gnu-openmpi2-hpc-devel"

inherit rpm
