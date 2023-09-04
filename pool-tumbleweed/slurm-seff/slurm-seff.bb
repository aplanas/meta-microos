SUMMARY = "Mail tool that includes job statistics in user notification email"
DESCRIPTION = "Mail program used directly by the SLURM daemons. On completion of a job, \
it waits for accounting information to be available and includes that \
information in the email body."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-seff-23.02.2-1.4.noarch.rpm"
RPM_HASH = "67e8e772c6088fd50d89018dba3318d8c379378c36013a8087b77cc32589648fb1a959e29e7400b44201948834d815bf11a6c4f32d193650af6dc44f8c240e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-seff"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
perl-slurm"

inherit rpm
