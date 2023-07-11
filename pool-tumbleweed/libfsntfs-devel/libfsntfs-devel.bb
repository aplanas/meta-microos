SUMMARY = "Development files for libfsntfs"
DESCRIPTION = "libfsntfs is a library to access the New Technology File System (NTFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsntfs."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "libfsntfs-devel-20230606-1.4.aarch64.rpm"
RPM_HASH = "d8cd6bde90483180bb9c7119515e3128ef57dc53cf455c683ed2b1ba4d30d527302b8405b27cb86ec6c0503bf38cfdadbdf826fdd0242570e2e0f6f1616e9b1b"

RPROVIDES:${PN} += "libfsntfs-devel \
pkgconfig-libfsntfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsntfs1"

inherit rpm
