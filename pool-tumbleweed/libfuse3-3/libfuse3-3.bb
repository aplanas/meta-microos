SUMMARY = "Library of FUSE, the User space File System for GNU/Linux and BSD"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
A FUSE file system is typically implemented as a standalone \
application that links with libfuse. libfuse provides a C API over \
the raw kernel interface."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.16.1"

RPM_NAME = "libfuse3-3-3.16.1-1.1.aarch64.rpm"
RPM_HASH = "cc2730e907c1f25a28d890f5cde15365008150cb70ff37128e915935ab3f49c1cae84d79f6aeb0e21fd0edf6acd5ac8fce68ab531c87c475788b113c550dcd19"

RPROVIDES:${PN} += "libfuse3-3 \
libfuse3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
