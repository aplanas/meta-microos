SUMMARY = "Minimal slurm node"
DESCRIPTION = "This package contains just the minmal code to run a compute node."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-node-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "302170012dd94ddb3bacecbe217e4184202d1351c7034bb62c09cc84090217fda1849c079ced71adacdf008f2e579acc7669d135672de2b61233ed008a806bca"

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
