SUMMARY = "Development files for libfsfat"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsfat."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "libfsfat-devel-20220925-3.12.aarch64.rpm"
RPM_HASH = "f5b2bc074bb18c40cddfbae69b41385d5a57ae42f7c70ddd1d897ab79ee77ffcec9579efb82cf5ca27572bcc214f97652801f0122f4a40c4d107f69609cd71fa"

RPROVIDES:${PN} += "libfsfat-devel \
pkgconfig-libfsfat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsfat1"

inherit rpm
