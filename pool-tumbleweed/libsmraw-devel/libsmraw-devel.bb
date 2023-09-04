SUMMARY = "Development files for libsmraw, a (split) RAW image file library"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmraw."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "libsmraw-devel-20230320-2.1.aarch64.rpm"
RPM_HASH = "4f8031c8a10339abc84708adf11e8aa0157902776b1edd6bdcfc020d659f649843fa79eef8fa6fa9b29de5879284dc1ef2106a606a41c0c47848be1e47891c47"

RPROVIDES:${PN} += "libsmraw-devel \
pkgconfig-libsmraw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libsmraw1"

inherit rpm
