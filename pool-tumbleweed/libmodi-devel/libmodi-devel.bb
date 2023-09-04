SUMMARY = "Development files for libmodi"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmodi."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "libmodi-devel-20221023-4.1.aarch64.rpm"
RPM_HASH = "9d1ab11361d1ff20e850f0e7db5663dbf408238b6163258136fffc4a1df7f2088aa72e5b06e8d8a696dd661b424cb243a6fa11efe679b1f589dc0ae3bd182825"

RPROVIDES:${PN} += "libmodi-devel \
pkgconfig-libmodi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libmodi1"

inherit rpm
