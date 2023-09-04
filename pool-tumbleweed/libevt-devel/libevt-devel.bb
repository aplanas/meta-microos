SUMMARY = "Development files for libevt, a Windows event file parser"
DESCRIPTION = "libevt is a library to access the Windows Event Log (EVT) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libevt."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "libevt-devel-20221022-4.1.aarch64.rpm"
RPM_HASH = "acd43ad0dfd5689de5830b1c544f1990e90e51fc10353a189ad1720ab7bcf85081e8f99429e7639f7bf526a5a20dd2dcebbfc5156c6bdc015396934c68f603c1"

RPROVIDES:${PN} += "libevt-devel \
pkgconfig-libevt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libevt1"

inherit rpm
