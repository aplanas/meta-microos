SUMMARY = "Development files for libfsfat"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsfat."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "libfsfat-devel-20220925-3.11.aarch64.rpm"
RPM_HASH = "723384718cbae2648ef0ea586527053bab15aae9ee6156e9d061f9fd2b4dd2ff05d116a904550f3d4db1b236b0febdecfa57df73ee59c43196bc19f29e6ad14f"

RPROVIDES:${PN} += "libfsfat-devel \
pkgconfig-libfsfat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsfat1"

inherit rpm
