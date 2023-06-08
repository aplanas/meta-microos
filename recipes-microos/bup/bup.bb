SUMMARY = "Backup program based on git"
DESCRIPTION = "Very efficient backup system based on the git packfile format, \
providing fast incremental saves and global deduplication \
(among and within files, including virtual machine images)."
LICENSE = "LGPL-2.0-only"

PV = "0.32"

RPM_NAME = "bup-0.32-2.6.aarch64.rpm"
RPM_HASH = "21487b5ae25835b2740baa0d2cb8d0b347b6996545f38135bf81335a69ab9c9e70d1662b1d80d1ba50427d20d44014f3dcfe74340102b25958dd10126037e68b"

RPROVIDES:${PN} += "bup bup(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh git-core ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) par2 python3 python3-fuse python3-pylibacl python3-pyxattr python3-tornado"

inherit rpm
