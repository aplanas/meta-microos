SUMMARY = "Library of FUSE, the User space File System for GNU/Linux and BSD"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
A FUSE file system is typically implemented as a standalone \
application that links with libfuse. libfuse provides a C API over \
the raw kernel interface."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "libfuse2-2.9.9-6.4.aarch64.rpm"
RPM_HASH = "ec20a98fda6e670f3be7d6ebb23537b75cd783c6a387d305805198a3a3238a30dbfe0d115a1e18221231096602884ff04fe90da94c67c241844c88b4674ca2a4"

RPROVIDES:${PN} += "libfuse.so.2 \
libfuse2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
