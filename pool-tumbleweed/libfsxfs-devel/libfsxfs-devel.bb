SUMMARY = "Development files for libfsxfs"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsxfs."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsxfs-devel-20220829-3.10.aarch64.rpm"
RPM_HASH = "5e12af023040a16a6201027d50aee0bbd63c73c88df3361fdd4ba8cd64682ae55bb572dd4c5f46fc29e578b66a40de7302bf5de04391f029e22904225db7af52"

RPROVIDES:${PN} += "libfsxfs-devel \
pkgconfig-libfsxfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsxfs1"

inherit rpm
