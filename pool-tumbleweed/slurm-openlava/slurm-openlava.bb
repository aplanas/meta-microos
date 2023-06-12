SUMMARY = "Wrappers for transitition from OpenLava/LSF to Slurm"
DESCRIPTION = "Wrapper scripts for aiding migration from OpenLava/LSF to Slurm"
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-openlava-23.02.2-1.1.noarch.rpm"
RPM_HASH = "e47293057f5b9fcb06b95d6201ed8aae9e2c3dd2cf14556ee2b18df2a155d12673e43c71d17173e409aa3d6c4e205bb90f6a2a1684c7f27c2e745bce66b1e849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-openlava"
RDEPENDS:${PN} += "/usr/bin/perl \
perl-slurm"

inherit rpm
