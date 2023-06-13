SUMMARY = "Library of FUSE, the User space File System for GNU/Linux and BSD"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
A FUSE file system is typically implemented as a standalone \
application that links with libfuse. libfuse provides a C API over \
the raw kernel interface."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.14.1"

RPM_NAME = "libfuse3-3-3.14.1-2.1.aarch64.rpm"
RPM_HASH = "d1ef999db1c005eefa9a1e6aeb9c4ec72182031a0325d8ecc023ad4aae138076b592bf63f03eebf8fab47ce11864e922da186669663db44149d1bbbef826a4b7"

RPROVIDES:${PN} += "libfuse3-3 \
libfuse3-3(aarch-64) \
libfuse3.so.3()(64bit) \
libfuse3.so.3(FUSE_3.0)(64bit) \
libfuse3.so.3(FUSE_3.1)(64bit) \
libfuse3.so.3(FUSE_3.12)(64bit) \
libfuse3.so.3(FUSE_3.2)(64bit) \
libfuse3.so.3(FUSE_3.3)(64bit) \
libfuse3.so.3(FUSE_3.4)(64bit) \
libfuse3.so.3(FUSE_3.7)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
