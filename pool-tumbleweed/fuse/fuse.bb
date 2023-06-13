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

RPM_NAME = "fuse-2.9.9-6.3.aarch64.rpm"
RPM_HASH = "4a9a35e3505019ed89bf00c7fa3f4b9fe82aa56c725266772380a21a21ac38cfa3c3f1d2ae8278276c6fc5ac05c13c6c5c6c473b950f32191f2043f831f036f7"

RPROVIDES:${PN} += "config(fuse) \
fuse \
fuse(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
group(trusted) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
permissions \
util-linux"

inherit rpm
