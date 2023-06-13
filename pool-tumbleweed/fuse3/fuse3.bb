SUMMARY = "Reference implementation of the 'Filesystem in Userspace'"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
This package contains helper programs for using FUSE mounts. \
 \
FUSE file systems are typically implemented as a standalone \
applications in their own right and are packaged separately."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.14.1"

RPM_NAME = "fuse3-3.14.1-2.1.aarch64.rpm"
RPM_HASH = "a9c893624df6bc7401b9277dc273b8ff14a8cd78b2411b4b1d7c7d85658e8f86d695a7d24067e9c50c4d57c49fbe5e797b493cc41e042a6db353e3660497d307"

RPROVIDES:${PN} += "config(fuse3) \
fuse3 \
fuse3(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
group(trusted) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse3.so.3()(64bit) \
libfuse3.so.3(FUSE_3.3)(64bit) \
permissions \
util-linux"

inherit rpm
