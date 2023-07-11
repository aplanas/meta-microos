SUMMARY = "Development files for libfwevt"
DESCRIPTION = "libfwevt is a library for Windows XML Event Log (EVTX) data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwevt."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230410"

RPM_NAME = "libfwevt-devel-20230410-1.3.aarch64.rpm"
RPM_HASH = "8097e040c266b943729436cf8ee4dd3ac85e868ba6e6e841eb11422609a26a5bf9b373bc4d0ace13a0b8e2737c2f88bb8e8acaa197e931046b7c7f810429a63d"

RPROVIDES:${PN} += "libfwevt-devel \
pkgconfig-libfwevt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwevt1"

inherit rpm
