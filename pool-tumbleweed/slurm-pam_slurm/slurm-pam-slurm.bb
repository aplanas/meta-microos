SUMMARY = "PAM module for restricting access to compute nodes via SLURM"
DESCRIPTION = "This module restricts access to compute nodes in a cluster where the Simple \
Linux Utility for Resource Managment (SLURM) is in use. Access is granted \
to root, any user with an SLURM-launched job currently running on the node, \
or any user who has allocated resources on the node according to the SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-pam_slurm-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "5d2ac66639a5d8f0050c1d671ec59601f73a4c9633a5054b79f07cecc15c4202ead01a44091566b0bae4be2205e84289634adf484367f937bf9028d525bc74ee"

RPROVIDES:${PN} += "slurm-pam_slurm \
slurm-pam_slurm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libslurm.so.39()(64bit) \
slurm-node"

inherit rpm
