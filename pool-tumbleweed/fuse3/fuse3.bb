SUMMARY = "Reference implementation of the 'Filesystem in Userspace'"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
This package contains helper programs for using FUSE mounts. \
 \
FUSE file systems are typically implemented as a standalone \
applications in their own right and are packaged separately."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.15.1"

RPM_NAME = "fuse3-3.15.1-1.1.aarch64.rpm"
RPM_HASH = "58cd1431cf2ed29dfd2988cbb9d4096108411f282d62d351c19f21a3f1e437812d1416042cb0d3ebee52b9b1b85246c77075b5c493bbb1d389cc227b9d68be5f"

RPROVIDES:${PN} += "config-fuse3 \
fuse3"

RDEPENDS:${PN} += "/usr/bin/sh \
group-trusted \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
permissions \
util-linux"

inherit rpm
