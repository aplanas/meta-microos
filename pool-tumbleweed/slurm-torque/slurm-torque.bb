SUMMARY = "Wrappers for transitition from Torque/PBS to SLURM"
DESCRIPTION = "Wrapper scripts for aiding migration from Torque/PBS to SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-torque-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "c9b1f06594b4fceda3ff9cce2854f2e90a8772e939c7f192ae0ae2d2c302885c1a62b78da8bc47e5107c05dcd0d18428002a85d4b2414be06a7eda717059112b"

RPROVIDES:${PN} += "slurm-torque \
slurm-torque(aarch-64) \
torque-client"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
perl-Switch \
perl-slurm"

inherit rpm
