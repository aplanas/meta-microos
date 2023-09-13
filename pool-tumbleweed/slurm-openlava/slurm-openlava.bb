SUMMARY = "Wrappers for transitition from OpenLava/LSF to Slurm"
DESCRIPTION = "Wrapper scripts for aiding migration from OpenLava/LSF to Slurm"
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-openlava-23.02.4-2.1.noarch.rpm"
RPM_HASH = "d45952c066cb64e334ecccf112dda4f0e72412e9f4105b81881afc7d28214482b14c115996c8c6f097e1a60285e410ee08a0f882f5ac4596700adf562f997ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-openlava"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-slurm"

inherit rpm
