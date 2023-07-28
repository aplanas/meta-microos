SUMMARY = "Library of FUSE, the User space File System for GNU/Linux and BSD"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
A FUSE file system is typically implemented as a standalone \
application that links with libfuse. libfuse provides a C API over \
the raw kernel interface."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.15.1"

RPM_NAME = "libfuse3-3-3.15.1-1.1.aarch64.rpm"
RPM_HASH = "079fd367fd2b7adbe7f90242a79c03a4c7cb0f23ebdbdc87fa319a4d80d24bed63431ea530a5e6f164f910369e37a52bbe16e188bda60a3519357858dccfb765"

RPROVIDES:${PN} += "libfuse3-3 \
libfuse3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
