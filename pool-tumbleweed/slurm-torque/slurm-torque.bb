SUMMARY = "Wrappers for transitition from Torque/PBS to SLURM"
DESCRIPTION = "Wrapper scripts for aiding migration from Torque/PBS to SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-torque-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "26041fba0a2b0521e74b3bfd9c559b9eef1d15f007c550aa4460b906d011f8b8acc6c4566ea9afb13fc73f2e38d04c2e8cccb537c2ddc8ee60970930ec67ad69"

RPROVIDES:${PN} += "slurm-torque \
torque-client"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl-Switch \
perl-slurm"

inherit rpm
