SUMMARY = "Development files for libfshfs, Mac OS Hierarchical File System (HFS) library"
DESCRIPTION = "libfshfs is a library to access the Mac OS Hierarchical File System \
(HFS) format. see libfshfs for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfshfs."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220831"

RPM_NAME = "libfshfs-devel-20220831-3.13.aarch64.rpm"
RPM_HASH = "bdc64d233831bae8041f0627e00d010bde45f038bed2c44a63aca723c235feef624af21c4bef12460a78760f860b6d43808ccd4b93ed52f5bb32dc1f7db4a28f"

RPROVIDES:${PN} += "libfshfs-devel \
pkgconfig-libfshfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfshfs1"

inherit rpm
