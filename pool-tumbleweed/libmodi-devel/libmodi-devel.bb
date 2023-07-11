SUMMARY = "Development files for libmodi"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmodi."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "libmodi-devel-20221023-3.11.aarch64.rpm"
RPM_HASH = "a3649ad96397a49046ecfb588584a745c4370f156c4859248392607bc4f9e817759b04bb555aff67ab8e43018f29718f7d8c67b48d7fe75d806fabc3f5c06fdd"

RPROVIDES:${PN} += "libmodi-devel \
pkgconfig-libmodi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libmodi1"

inherit rpm
