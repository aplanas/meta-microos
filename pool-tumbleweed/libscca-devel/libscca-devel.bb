SUMMARY = "Development files for libscca"
DESCRIPTION = "libscca is a library to access the Windows Prefetch File (PF) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libscca."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "libscca-devel-20221027-3.10.aarch64.rpm"
RPM_HASH = "a397c4ffd5319f4586a397a3996bfb645ed420acd268edfaa9e5787db162c0b279b74259fe654cb731d277b0000af485b8284d7946540fd3e3ba654f21881cf3"

RPROVIDES:${PN} += "libscca-devel \
pkgconfig-libscca"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libscca1"

inherit rpm
