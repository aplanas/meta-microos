SUMMARY = "Development files for libfsclfs"
DESCRIPTION = "libfsclfs is a library to access the Common Log File System (CLFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsclfs."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libfsclfs-devel-20210417-3.6.aarch64.rpm"
RPM_HASH = "5fcb6b3a6fb8e62811369949a27141eedbc0065f85fda2a90f16b95afce8165b38e1b2ea613865341e328816cbaa92b3b82bc9f347a3b30383277d663239c081"

RPROVIDES:${PN} += "libfsclfs-devel \
pkgconfig-libfsclfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsclfs1"

inherit rpm
