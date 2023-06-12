SUMMARY = "Library for manipulating partitions"
DESCRIPTION = "Libparted is a library for creating, destroying, resizing, checking \
and copying partitions and the file systems on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.5"

RPM_NAME = "libparted-fs-resize0-3.5-4.4.aarch64.rpm"
RPM_HASH = "b23f2fed8c49d7cb4c3202077584d874fe426b2dd13f3cdc090997aacb613d41eb6e8518a819358b3cdcdf5a2c698dc3563e333974134524b443318887ee77e1"

RPROVIDES:${PN} += "libparted-fs-resize.so.0()(64bit) \
libparted-fs-resize.so.0(LIBPARTED_FS_RESIZE_0.0.0)(64bit) \
libparted-fs-resize0 \
libparted-fs-resize0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
