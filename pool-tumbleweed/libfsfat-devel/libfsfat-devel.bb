SUMMARY = "Development files for libfsfat"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsfat."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "libfsfat-devel-20220925-3.9.aarch64.rpm"
RPM_HASH = "738c7998c30067d89a01b5bc1f790341e2d9d331e4fa008e8c50dbf223fc2c65d103b9075cb21d445e8f31d5c79865f59309b1e1932883eebffd82c354e272c2"

RPROVIDES:${PN} += "libfsfat-devel \
pkgconfig-libfsfat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsfat1"

inherit rpm
