SUMMARY = "PAM module for restricting access to compute nodes via SLURM"
DESCRIPTION = "This module restricts access to compute nodes in a cluster where the Simple \
Linux Utility for Resource Managment (SLURM) is in use. Access is granted \
to root, any user with an SLURM-launched job currently running on the node, \
or any user who has allocated resources on the node according to the SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-pam_slurm-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "7ba18e0833b33fb690a2aeac2fcf8315480e78e3954bca7705518ad7d8a4f0a79714c905dc80903f4a59f77159841d249155d080fa994486c6c569d51136d7d5"

RPROVIDES:${PN} += "slurm-pam-slurm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm.so.39 \
slurm-node"

inherit rpm
