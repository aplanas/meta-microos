SUMMARY = "Reference implementation of the 'Filesystem in Userspace'"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
This package contains helper programs for using FUSE mounts. \
 \
FUSE file systems are typically implemented as a standalone \
applications in their own right and are packaged separately."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.16.1"

RPM_NAME = "fuse3-3.16.1-1.1.aarch64.rpm"
RPM_HASH = "01cdf1ffa63ee64ba96fbc8e5a40f5c8e8268417a038ef0b69c8d1c31d52f326b1ee8f528fd86d61408a7075fce7de492870f4e68659c84f7506c3e691d6f6f4"

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
