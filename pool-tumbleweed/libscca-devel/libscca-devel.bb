SUMMARY = "Development files for libscca"
DESCRIPTION = "libscca is a library to access the Windows Prefetch File (PF) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libscca."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "libscca-devel-20221027-3.11.aarch64.rpm"
RPM_HASH = "7a03cc46b438d323fa7ed6a4aa53934fa0b1465547689affed1b470bb0982f948976d1f1865f916aeafd956353d9cfb0154dd5fec451c42f2d2d3617b5981a93"

RPROVIDES:${PN} += "libscca-devel \
pkgconfig-libscca"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libscca1"

inherit rpm
