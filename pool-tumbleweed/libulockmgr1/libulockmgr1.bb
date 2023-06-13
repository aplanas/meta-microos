SUMMARY = "Library of FUSE, the User space File System for GNU/Linux and BSD"
DESCRIPTION = "With FUSE, a user space program can export a file system through the \
kernel-default (Linux kernel)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "libulockmgr1-2.9.9-6.3.aarch64.rpm"
RPM_HASH = "acd571adc645de8b541321a15eb7440b2627a20c2d002316276bffee960413821d1fed41e2fe94fc25f630426b9ce2ca9bdaeecd96fd2a8ea07738423f124d9b"

RPROVIDES:${PN} += "libulockmgr.so.1()(64bit) \
libulockmgr1 \
libulockmgr1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
