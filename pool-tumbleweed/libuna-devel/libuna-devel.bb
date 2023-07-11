SUMMARY = "Development files for libuna, a library to support Unicode/ASCII conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libuna."
LICENSE = "LGPL-3.0-or-later"

PV = "20230702"

RPM_NAME = "libuna-devel-20230702-1.1.aarch64.rpm"
RPM_HASH = "fb03a82f986b891e7101427b251bab2188109e8bcdf42d13b6f993cc62e7e86f7c79c0ccff95e0eca39597e5df5f82b5d7dd7c8c70a1ba0314fe55a78790b9f3"

RPROVIDES:${PN} += "libuna-devel \
pkgconfig-libuna"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuna1"

inherit rpm
