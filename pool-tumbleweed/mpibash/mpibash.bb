SUMMARY = "Parallel scripting right from the Bourne-Again Shell"
DESCRIPTION = "MPI-Bash makes it possible to parallelize Bash scripts which run a set of \
Linux commands independently over a large number of input files. \
Because MPI-Bash includes various MPI functions for data transfer and \
synchronization, it is not limited to parallel workloads \
but can incorporate phased operations (i.e. all workers must finish \
operation X before any worker is allowed to begin operation Y)."
LICENSE = "GPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "mpibash-1.3-3.8.aarch64.rpm"
RPM_HASH = "ba7c49052ce4e14622a7605f66db15dc3079d9f5b74d7caa71f25ade36c44772109c093e9f37e30890acc3fded6d54391497fde4260ef50a761ecd5e86e7eead"

RPROVIDES:${PN} += "mpibash"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcircle.so.2 \
libmpi.so.40 \
openmpi4-libs"

inherit rpm
