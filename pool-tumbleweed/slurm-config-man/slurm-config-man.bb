SUMMARY = "Config files and directories for slurm services"
DESCRIPTION = "Man pages for the SLURM cluster managment software config files."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-config-man-23.02.4-2.1.noarch.rpm"
RPM_HASH = "7f1af4f723089e236b090916337b48b3f57b70495f1103c8ec5fdc6954451a5c027c99b32f6b5b9e72a8f41cdb5d5db36424083255b67c035ba5a0ca7f241bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-config-man"

RDEPENDS:${PN} += ""

inherit rpm
