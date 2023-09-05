SUMMARY = "Development files for libfsfat"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsfat."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "libfsfat-devel-20220925-4.2.aarch64.rpm"
RPM_HASH = "1edcd88a599cec921937bd3e360e709bef1c6b642d0832bc021838002064154ca1e95ee4b67659b7b84313ba583ebe40cc8711cee65dbc79d4cd617255e27964"

RPROVIDES:${PN} += "libfsfat-devel \
pkgconfig-libfsfat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsfat1"

inherit rpm
