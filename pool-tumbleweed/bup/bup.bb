SUMMARY = "Backup program based on git"
DESCRIPTION = "Very efficient backup system based on the git packfile format, \
providing fast incremental saves and global deduplication \
(among and within files, including virtual machine images)."
LICENSE = "LGPL-2.0-only"

PV = "0.32.1"

RPM_NAME = "bup-0.32.1-1.2.aarch64.rpm"
RPM_HASH = "da4b19658666a02d3beb5cdba8e7fc5bc5b0e97345be531cd3ea7c82e1e51af8d787abb49c2123b1699034ee4242c37e1fc86aaaebbd6ca6ff236239e01d1329"

RPROVIDES:${PN} += "bup"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
git-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
par2 \
python3 \
python3-fuse \
python3-pylibacl \
python3-pyxattr \
python3-tornado"

inherit rpm
