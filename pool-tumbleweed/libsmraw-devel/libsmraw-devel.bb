SUMMARY = "Development files for libsmraw, a (split) RAW image file library"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmraw."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "libsmraw-devel-20230320-1.8.aarch64.rpm"
RPM_HASH = "2cd53fd6686ece2c544fed95712e2ab98a02aea7100cf1d2a1651633f7299c9cae07772bc3d3bf5f295ca27c13a74b52918a6c4b9674a1ae38be5de4c510d1d7"

RPROVIDES:${PN} += "libsmraw-devel \
pkgconfig-libsmraw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libsmraw1"

inherit rpm
