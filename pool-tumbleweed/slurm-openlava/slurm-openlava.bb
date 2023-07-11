SUMMARY = "Wrappers for transitition from OpenLava/LSF to Slurm"
DESCRIPTION = "Wrapper scripts for aiding migration from OpenLava/LSF to Slurm"
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-openlava-23.02.2-1.3.noarch.rpm"
RPM_HASH = "0d6f30c2d18c82afc5ef5cda194495a1b16a23af70d421cd93e9db5996b1eed0f6a218a18d702fc1cd0d20af0fc931df6ffc00922b76cbaa45200fd97197c12c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-openlava"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-slurm"

inherit rpm
