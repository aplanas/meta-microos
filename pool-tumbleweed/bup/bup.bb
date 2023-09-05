SUMMARY = "Backup program based on git"
DESCRIPTION = "Very efficient backup system based on the git packfile format, \
providing fast incremental saves and global deduplication \
(among and within files, including virtual machine images)."
LICENSE = "LGPL-2.0-only"

PV = "0.33.2"

RPM_NAME = "bup-0.33.2-1.1.aarch64.rpm"
RPM_HASH = "77e5e59764ea68fc22c52f8a5130fcbdb6f9908c7affba23a963d8badc5b7f5f676aeafd1a4954377a30acf0d0982f19d51d119c3badc2f5cb6b7627ba4965dc"

RPROVIDES:${PN} += "bup"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
git-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
par2 \
python311 \
python311-fuse \
python311-pylibacl \
python311-pyxattr \
python311-tornado"

inherit rpm
