SUMMARY = "Backup program based on git"
DESCRIPTION = "Very efficient backup system based on the git packfile format, \
providing fast incremental saves and global deduplication \
(among and within files, including virtual machine images)."
LICENSE = "LGPL-2.0-only"

PV = "0.32.1"

RPM_NAME = "bup-0.32.1-1.1.aarch64.rpm"
RPM_HASH = "3e5ff6f4ccd4afca22dd603ff2a32b9dde59959685d130df2125ae0b178ac90f710c8c0050dce3eb1527db6a4cb04587432acd25ac594b47890c3607e72ff8de"

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
