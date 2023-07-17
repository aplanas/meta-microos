SUMMARY = "Development files for libfwevt"
DESCRIPTION = "libfwevt is a library for Windows XML Event Log (EVTX) data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwevt."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230410"

RPM_NAME = "libfwevt-devel-20230410-1.4.aarch64.rpm"
RPM_HASH = "b488dd75fbdc54c71be286f37eeedf57a1ed749b3ab1272ba0d25f86d65eec259c50a695e5f48948b9cff4abff5cb5c1b8e4fb46e1866799d334c89ad8564502"

RPROVIDES:${PN} += "libfwevt-devel \
pkgconfig-libfwevt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwevt1"

inherit rpm
