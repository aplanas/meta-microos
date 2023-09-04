SUMMARY = "Minimal slurm node"
DESCRIPTION = "This package contains just the minmal code to run a compute node."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-node-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "c6f832507d22598b5ac81df99411269d198b160b66e434ec3e2df55d715470afbcb04ff11f35328e4e5c127ea7350a64221a9e1043faaac1f6fb7c5931a77bbd"

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
