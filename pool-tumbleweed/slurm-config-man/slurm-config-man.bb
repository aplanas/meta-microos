SUMMARY = "Config files and directories for slurm services"
DESCRIPTION = "Man pages for the SLURM cluster managment software config files."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-config-man-23.02.2-1.3.noarch.rpm"
RPM_HASH = "402a4ab22a46d700ba781ccd0ef81a5ca3dac07af59e21b3c3afb9fcf627c6eb208f2a5db31c4a55047125cd4d81ccdab675efdc5a8467c17c4aeb3e02f43aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-config-man"

RDEPENDS:${PN} += ""

inherit rpm
