SUMMARY = "Development files for libfsxfs"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsxfs."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsxfs-devel-20220829-3.11.aarch64.rpm"
RPM_HASH = "f314a8a560d1185eacdc11f713d76d476fa253eff9f0b0cf39785452d79ec36557bd3eee238bf9d9841cbe1e03a96c5ce7114709d239119878eb37007cfc9260"

RPROVIDES:${PN} += "libfsxfs-devel \
pkgconfig-libfsxfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsxfs1"

inherit rpm
