SUMMARY = "SLURM plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes to run on by SLURM jobs or partitions."
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-slurm-2.34-12.1.aarch64.rpm"
RPM_HASH = "f8fbbb0aa2fa89c15ae9edc023163292c67d36d2f5d4cff7c8d4269b4768856a397c7b99ed24028208c783239e41a86a44d67328f9861d70f2dac47124108053"

RPROVIDES:${PN} += "pdsh-slurm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm.so.39 \
pdsh"

inherit rpm
