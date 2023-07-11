SUMMARY = "Reference implementation of the 'Filesystem in Userspace'"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
This package contains helper programs for using FUSE mounts. \
 \
FUSE file systems are typically implemented as a standalone \
applications in their own right and are packaged separately."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "fuse-2.9.9-6.4.aarch64.rpm"
RPM_HASH = "45fa3197b1fa1f8c035f3e78fa2b184eb28a9d7f5aa0846f8ad912fb26bd86031ef27c174bd9e964c90ccef851f69e38ff22b222590c220d3645483a7ef9b6d5"

RPROVIDES:${PN} += "config-fuse \
fuse"

RDEPENDS:${PN} += "/usr/bin/sh \
group-trusted \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions \
util-linux"

inherit rpm
