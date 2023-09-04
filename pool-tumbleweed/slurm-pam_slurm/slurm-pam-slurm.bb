SUMMARY = "PAM module for restricting access to compute nodes via SLURM"
DESCRIPTION = "This module restricts access to compute nodes in a cluster where the Simple \
Linux Utility for Resource Managment (SLURM) is in use. Access is granted \
to root, any user with an SLURM-launched job currently running on the node, \
or any user who has allocated resources on the node according to the SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-pam_slurm-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "9049c3f7397eee59b51f0d1113e8cc643e216cae6b99187a2fcea6315d590f8d74ebeff04ac852ec77dc3ec1101a5a7315ed8be32b949506b3b454bda9fac146"

RPROVIDES:${PN} += "slurm-pam-slurm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm.so.39 \
slurm-node"

inherit rpm
