SUMMARY = "Wrappers for transitition from Torque/PBS to SLURM"
DESCRIPTION = "Wrapper scripts for aiding migration from Torque/PBS to SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-torque-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "e8047438e07b253ed093644cbc1a36a7758d2379f50c036af35eb9ffa056cd10f452f6a94e0d2bcf2b94c8335215d9dd48900ab1b003045a724d98e97ff2c43f"

RPROVIDES:${PN} += "slurm-torque \
torque-client"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl-Switch \
perl-slurm"

inherit rpm
