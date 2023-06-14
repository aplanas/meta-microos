SUMMARY = "NSS Plugin for SLURM"
DESCRIPTION = "libnss_slurm is an optional NSS plugin that permits password and group \
resolution for a job on a compute node to be serviced through the local \
slurmstepd process."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "libnss_slurm2-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "84217489df8e792a5aa5614fedfe31ec980ebd3302443c9a34a5113639ca4ce72006b076e34d206153c0e89322f8ac2f898ebec07436d9c7890a2c5f3a81d7bd"

RPROVIDES:${PN} += "config-libnss-slurm2 \
libnss-slurm.so.2 \
libnss-slurm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm.so.39"

inherit rpm
