SUMMARY = "Wrappers for transitition from Torque/PBS to SLURM"
DESCRIPTION = "Wrapper scripts for aiding migration from Torque/PBS to SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-torque-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "e0aa7bc7e83922340bc2473e401a48eaf4336589b06f5d2e21cd230dbb3e71af4f6797bddd3c93a2e78c6455e17a42b395a5a6d9cf7ff36119d165987699aea4"

RPROVIDES:${PN} += "slurm-torque \
torque-client"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl-Switch \
perl-slurm"

inherit rpm
