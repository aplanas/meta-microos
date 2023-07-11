SUMMARY = "Library of FUSE, the User space File System for GNU/Linux and BSD"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
A FUSE file system is typically implemented as a standalone \
application that links with libfuse. libfuse provides a C API over \
the raw kernel interface."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.15.0"

RPM_NAME = "libfuse3-3-3.15.0-1.1.aarch64.rpm"
RPM_HASH = "e509184810eefdd02414968ce4c9423276a6c08f086507de869ddc7ef74a71f4884d33a12c1840c7b6d09f70a667543b67d8c3ff00796d8bda0e1c175c5d79c3"

RPROVIDES:${PN} += "libfuse3-3 \
libfuse3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
