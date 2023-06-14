SUMMARY = "Development files for libodraw, a disc image file library"
DESCRIPTION = "libodraw is a library to access optical disc (split) RAW images such \
as BIN/ISO/CUE. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libodraw."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210503"

RPM_NAME = "libodraw-devel-20210503-3.6.aarch64.rpm"
RPM_HASH = "3a2c81308bec7f08ea294da9770ec7edbd93f275f6ecf2621e513a15b8ebeab6a65b46020fba1ab00825c7d7d0f3646b96a17e1b537bde7129f1edb6249f0978"

RPROVIDES:${PN} += "libodraw-devel \
pkgconfig-libodraw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libodraw1"

inherit rpm
