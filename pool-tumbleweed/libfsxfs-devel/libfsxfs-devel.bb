SUMMARY = "Development files for libfsxfs"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsxfs."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsxfs-devel-20220829-3.8.aarch64.rpm"
RPM_HASH = "6e2ce78189efd34302b04a16cb08dc5d03e54da4b875f40fa8a4bc132d9ae4a35d1a7ed1cf99aa5109e9fd6ea2e293ff64c4b8078ee6f88504d2f6e68edeafbf"

RPROVIDES:${PN} += "libfsxfs-devel \
pkgconfig-libfsxfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsxfs1"

inherit rpm
