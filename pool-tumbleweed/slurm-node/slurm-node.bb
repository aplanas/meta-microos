SUMMARY = "Minimal slurm node"
DESCRIPTION = "This package contains just the minmal code to run a compute node."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-node-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "81c878db107f8b57326c9e80d14dff16fbb3fb5e0102ba7a7285e7215a42c2e195cc2c7d04e5d0f40e7d897d3ec832c311dfc879ef654d752527d9b2c15b7717"

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
