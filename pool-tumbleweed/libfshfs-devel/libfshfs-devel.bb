SUMMARY = "Development files for libfshfs, Mac OS Hierarchical File System (HFS) library"
DESCRIPTION = "libfshfs is a library to access the Mac OS Hierarchical File System \
(HFS) format. see libfshfs for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfshfs."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220831"

RPM_NAME = "libfshfs-devel-20220831-3.9.aarch64.rpm"
RPM_HASH = "a55d67ce40b6a89b41cee62134f19fb03a2fc5e51ccd17b372d4b176612c1342f38636f0ab0aac4b7a7a418b363a47395bb1b01302450974bb00abcffa179623"

RPROVIDES:${PN} += "libfshfs-devel \
pkgconfig-libfshfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfshfs1"

inherit rpm
