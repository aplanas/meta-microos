SUMMARY = "Tool for storage management"
DESCRIPTION = "barrel is a command line tool for storage management."
LICENSE = "GPL-2.0-only"

PV = "0.2.0"

RPM_NAME = "barrel-0.2.0-1.3.aarch64.rpm"
RPM_HASH = "a81baebda7182b2061a97bebb3896582d3d670af6141ab4e06d13d38f3265e2cde6a0eced0497d017e9cb233967caa866a430e7b21da4d4d19f85c66682c8585"

RPROVIDES:${PN} += "barrel \
config-barrel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjson-c.so.5 \
libreadline.so.8 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1"

inherit rpm
