SUMMARY = "Delta Filesystem"
DESCRIPTION = "Deltafs combines a read-only lower directory and a read-write upper \
directory into a new filesystem.  Currently it works very similarly to \
a union filesystem, where upon modification whole files are copied up \
to the upper layer.  There are plans to store differences more \
efficiently in the future."
LICENSE = "GPL-2.0"

PV = "1.0"

RPM_NAME = "deltafs-1.0-23.28.aarch64.rpm"
RPM_HASH = "f1f1571ca9f4ed1184f2ea757d5e7dd5879f09a48a69178f33c62a5f90eaceb64c0de63088c6ba8eb57f5d8ff1adb60716d99939b851c3959837f1049a1e2d16"

RPROVIDES:${PN} += "deltafs \
deltafs(aarch-64)"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.4)(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libfuse.so.2(FUSE_2.8)(64bit)"

inherit rpm
