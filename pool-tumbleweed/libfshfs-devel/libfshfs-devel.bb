SUMMARY = "Development files for libfshfs, Mac OS Hierarchical File System (HFS) library"
DESCRIPTION = "libfshfs is a library to access the Mac OS Hierarchical File System \
(HFS) format. see libfshfs for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfshfs."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220831"

RPM_NAME = "libfshfs-devel-20220831-4.1.aarch64.rpm"
RPM_HASH = "99c66f98d78ad9c9c1c547560cb2032a9a9528f401a379595061d00a3957aadc68a37ccf7f429bacd0e9c89c630133a748b96bba65870470dafcbcfe2aa84340"

RPROVIDES:${PN} += "libfshfs-devel \
pkgconfig-libfshfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfshfs1"

inherit rpm
