SUMMARY = "Development files for libodraw, a disc image file library"
DESCRIPTION = "libodraw is a library to access optical disc (split) RAW images such \
as BIN/ISO/CUE. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libodraw."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210503"

RPM_NAME = "libodraw-devel-20210503-3.8.aarch64.rpm"
RPM_HASH = "86e818e668d188545a71800b3cb58623757317daf23ba924fdc2ec7008f0209078b0d3b05df732e5dbf162c6819a8c5c65fbc4a59f083d09970974a28ef6993b"

RPROVIDES:${PN} += "libodraw-devel \
pkgconfig-libodraw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libodraw1"

inherit rpm
