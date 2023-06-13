SUMMARY = "Library for interfacing with the kernel's sysfs filesystem"
DESCRIPTION = "This package's purpose is to provide a library for interfacing with the \
kernel's sys filesystem mounted at /sys. The library was an attempt to \
create a stable interface to sysfs, but it failed. It is still provided \
for the current users, but no new software should use this library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.1"

RPM_NAME = "libsysfs2-2.1.1-1.8.aarch64.rpm"
RPM_HASH = "763fb0c3f8e912b1c9397c7482edd266dfdda680f32cf55b1c780a9738d1f02a44ea57f0650769540f836b433f60756a4de1cf0f432b6ea63c34733fb115dbdd"

RPROVIDES:${PN} += "libsysfs.so.2()(64bit) \
libsysfs2 \
libsysfs2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
