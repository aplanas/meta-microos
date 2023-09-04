SUMMARY = "Development files for libfsxfs"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsxfs."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsxfs-devel-20220829-4.1.aarch64.rpm"
RPM_HASH = "8b59ad38372f893f1eaf07ca9ab4271ad2d6e9cbdd7c59d5733737560ceab6daf068257c423e2f5782a14fbfd59feab7aaee3b249382b79b777c72304bc461ed"

RPROVIDES:${PN} += "libfsxfs-devel \
pkgconfig-libfsxfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsxfs1"

inherit rpm
