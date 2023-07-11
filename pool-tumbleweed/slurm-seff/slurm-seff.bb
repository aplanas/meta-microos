SUMMARY = "Mail tool that includes job statistics in user notification email"
DESCRIPTION = "Mail program used directly by the SLURM daemons. On completion of a job, \
it waits for accounting information to be available and includes that \
information in the email body."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-seff-23.02.2-1.3.noarch.rpm"
RPM_HASH = "46d3ddd22c8c94935857bc8656c696219ca4f73b3b9e88620d712a1c201b7030687df7534934c020aeb83292934d49b275949eadae3e7977695622e66750980a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-seff"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
perl-slurm"

inherit rpm
