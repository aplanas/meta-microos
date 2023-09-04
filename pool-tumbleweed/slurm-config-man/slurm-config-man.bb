SUMMARY = "Config files and directories for slurm services"
DESCRIPTION = "Man pages for the SLURM cluster managment software config files."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-config-man-23.02.2-1.4.noarch.rpm"
RPM_HASH = "8f7f485eaeeedeb907928db37bff39b35d8cd12dfef461fbbb3e90fc433eb1c3e5ecc082314f4fdc26ff73e321f1b8ef546cf48df2542a80523f1c4a5367111f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-config-man"

RDEPENDS:${PN} += ""

inherit rpm
