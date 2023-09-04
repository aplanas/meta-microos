SUMMARY = "Wrappers for transitition from OpenLava/LSF to Slurm"
DESCRIPTION = "Wrapper scripts for aiding migration from OpenLava/LSF to Slurm"
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-openlava-23.02.2-1.4.noarch.rpm"
RPM_HASH = "22c7cb8a1b208af370ee47e5d587e4ca165f9c1cd606aa3e53af98f70bf841d8a7b85dd2b63b1380a4ca503a36d3f17a1a47c715c578f7185b98eabeb524c7d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-openlava"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-slurm"

inherit rpm
