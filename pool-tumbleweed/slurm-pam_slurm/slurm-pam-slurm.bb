SUMMARY = "PAM module for restricting access to compute nodes via SLURM"
DESCRIPTION = "This module restricts access to compute nodes in a cluster where the Simple \
Linux Utility for Resource Managment (SLURM) is in use. Access is granted \
to root, any user with an SLURM-launched job currently running on the node, \
or any user who has allocated resources on the node according to the SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-pam_slurm-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "aec87c81f622038a93d56b9f0c0290b3029eb70db68e8da25229625b2ffdfa1e3c0315ad8dd6d56d57be70af907cad9d33fb0f3406be5f14ddc832a0041ed5ee"

RPROVIDES:${PN} += "slurm-pam-slurm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm.so.39 \
slurm-node"

inherit rpm
