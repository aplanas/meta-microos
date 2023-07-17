SUMMARY = "Development files for libodraw, a disc image file library"
DESCRIPTION = "libodraw is a library to access optical disc (split) RAW images such \
as BIN/ISO/CUE. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libodraw."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210503"

RPM_NAME = "libodraw-devel-20210503-3.9.aarch64.rpm"
RPM_HASH = "0064420c1b2a0e6397d4360be79e9cd346d555d932c44f042ea0154961ea138c2b1b2ce72875b9a21340dbb2a4b700e6baf2e0b69681752fcd2aa18b9e0e2ba8"

RPROVIDES:${PN} += "libodraw-devel \
pkgconfig-libodraw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libodraw1"

inherit rpm
