SUMMARY = "Development files for libsmraw, a (split) RAW image file library"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmraw."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "libsmraw-devel-20230320-1.3.aarch64.rpm"
RPM_HASH = "0cb5973466fd3d789a492f6aec56f97f681bbc6857485cffa590cff2dbde402119f7f3dde1eb1401d7c7011038b7a61303956420ac3e21dafcb5e2288df33e83"

RPROVIDES:${PN} += "libsmraw-devel \
pkgconfig-libsmraw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libsmraw1"

inherit rpm
