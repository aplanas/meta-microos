SUMMARY = "Development files for libevt, a Windows event file parser"
DESCRIPTION = "libevt is a library to access the Windows Event Log (EVT) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libevt."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "libevt-devel-20221022-3.11.aarch64.rpm"
RPM_HASH = "d0cce654c1dda415cfa5b9d726f0a185c92961c635b9828c12114ca4b31f7191d3a33da9d5370e6924a40ab884ee45b6a255a3dae0b3096244ef54390fcaaaef"

RPROVIDES:${PN} += "libevt-devel \
pkgconfig-libevt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libevt1"

inherit rpm
