SUMMARY = "Development files for libevt, a Windows event file parser"
DESCRIPTION = "libevt is a library to access the Windows Event Log (EVT) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libevt."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "libevt-devel-20221022-3.12.aarch64.rpm"
RPM_HASH = "18d2f2f2b59c241fc2c2f7295583d748d07f8c2930484c9a1ae03e5bee54290cbcb430ce4124273e9d2c86663a7790960aea0a171e509fd9df9201ef97756c75"

RPROVIDES:${PN} += "libevt-devel \
pkgconfig-libevt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libevt1"

inherit rpm
