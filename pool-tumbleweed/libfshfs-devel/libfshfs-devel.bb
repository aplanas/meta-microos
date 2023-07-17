SUMMARY = "Development files for libfshfs, Mac OS Hierarchical File System (HFS) library"
DESCRIPTION = "libfshfs is a library to access the Mac OS Hierarchical File System \
(HFS) format. see libfshfs for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfshfs."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220831"

RPM_NAME = "libfshfs-devel-20220831-3.14.aarch64.rpm"
RPM_HASH = "cc812b2110b79711f543dfd834b9ef22e95fb965e3dabc881adb4f2911ec681d325d9a34770f720c0ab0e8e8e8e17e77cacee897da49a759a8e7f2916aa0b094"

RPROVIDES:${PN} += "libfshfs-devel \
pkgconfig-libfshfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfshfs1"

inherit rpm
