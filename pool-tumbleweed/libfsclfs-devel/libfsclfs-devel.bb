SUMMARY = "Development files for libfsclfs"
DESCRIPTION = "libfsclfs is a library to access the Common Log File System (CLFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsclfs."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libfsclfs-devel-20210417-3.5.aarch64.rpm"
RPM_HASH = "80d1ca7c47f56628c4462f6913caa5eeaadb7881620b9fc4d83ad376bc29693aaae8e8235d3f0b5ff7d5cb71b1f635c7832aeea79c723c32386ab475dfdb0c8f"

RPROVIDES:${PN} += "libfsclfs-devel \
pkgconfig-libfsclfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsclfs1"

inherit rpm
