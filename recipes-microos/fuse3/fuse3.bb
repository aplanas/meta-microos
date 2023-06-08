SUMMARY = "Reference implementation of the 'Filesystem in Userspace'"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
This package contains helper programs for using FUSE mounts. \
 \
FUSE file systems are typically implemented as a standalone \
applications in their own right and are packaged separately."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.14.1"

RPM_NAME = "fuse3-3.14.1-1.1.aarch64.rpm"
RPM_HASH = "fe4c62c1f99778b8e01ff70517722ca966a3915bf7cb3ace32eccb24986b8ea9702142a7717b8af4508cdc5414b69fa72f375879273a9eac606c1157ebab3d09"

RPROVIDES:${PN} += "config(fuse3) fuse3 fuse3(aarch-64)"
RDEPENDS:${PN} += "/bin/sh group(trusted) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfuse3.so.3()(64bit) libfuse3.so.3(FUSE_3.3)(64bit) permissions util-linux"

inherit rpm
