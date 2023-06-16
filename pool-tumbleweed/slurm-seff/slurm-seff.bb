SUMMARY = "Mail tool that includes job statistics in user notification email"
DESCRIPTION = "Mail program used directly by the SLURM daemons. On completion of a job, \
it waits for accounting information to be available and includes that \
information in the email body."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-seff-23.02.2-1.1.noarch.rpm"
RPM_HASH = "21b0f1b4859b851450d0fe45f54aa29759fbafd1d2e15a49b27c390f3cc75eb64aec23d0506e736a42e2e6ecbd0cc0af308c7a647aaac0d2f03268945a9b535a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-seff"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
perl-slurm"

inherit rpm
