SUMMARY = "Library of FUSE, the User space File System for GNU/Linux and BSD"
DESCRIPTION = "With FUSE, a user space program can export a file system through the \
kernel-default (Linux kernel)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "libulockmgr1-2.9.9-6.4.aarch64.rpm"
RPM_HASH = "ac2c1ff1a2ef98fce7988446ac8b5dd352ec8b08730b78eb490d6670a2565d9108d403eae238700e16efc427e197fc7293b8d2612d4e31d1d53d530d551d43eb"

RPROVIDES:${PN} += "libulockmgr.so.1 \
libulockmgr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
