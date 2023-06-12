SUMMARY = "Config files and directories for slurm services"
DESCRIPTION = "Man pages for the SLURM cluster managment software config files."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-config-man-23.02.2-1.1.noarch.rpm"
RPM_HASH = "226f1ed694fbb7fcde8e4ad2bb1795c907e6df9b6a86a74dbaaa466976006e349cfc84cadd80b54b05859c0f2dd291c17789e709c9d8492c34d6ee9586175bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-config-man"
RDEPENDS:${PN} += ""

inherit rpm
