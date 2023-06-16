SUMMARY = "Minimal slurm node"
DESCRIPTION = "This package contains just the minmal code to run a compute node."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-node-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "45b2e2c9fe653f5ff77fa7feebffa80fa17b774ca3facda6ea95cd799b3c910234bb5be2734e49954e5b660518306bc0994b34bfb8d6d550e5294afe55a179ad"

RPROVIDES:${PN} += "slurm-node"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhwloc.so.15 \
liblua5.4.so.5 \
liblz4.so.1 \
libm.so.6 \
libpam-misc.so.0 \
libpam.so.0 \
libresolv.so.2 \
libslurmfull.so \
slurm-config \
slurm-plugins"

inherit rpm
