SUMMARY = "SLURM plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes to run on by SLURM jobs or partitions."
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-slurm-2.34-10.2.aarch64.rpm"
RPM_HASH = "98395b3152be3ea1c0afb4d7fa6aebe363a11c257c974ec7b1ec60104fa4060afb0eea0f199239a0fcdae46df17d4ae4ee35737d68e5780335db586f6974e05b"

RPROVIDES:${PN} += "pdsh-slurm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm.so.39 \
pdsh"

inherit rpm
