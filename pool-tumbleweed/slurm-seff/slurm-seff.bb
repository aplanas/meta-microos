SUMMARY = "Mail tool that includes job statistics in user notification email"
DESCRIPTION = "Mail program used directly by the SLURM daemons. On completion of a job, \
it waits for accounting information to be available and includes that \
information in the email body."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-seff-23.02.4-2.1.noarch.rpm"
RPM_HASH = "cf64bbf396d31c946648f12010e4cfd447218b9f6af5a6a00c942263e76a860c0795828df41f54eb08a7bca2da896efde1d48c22dcc0ed8e9979753563545422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-seff"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
perl-slurm"

inherit rpm
