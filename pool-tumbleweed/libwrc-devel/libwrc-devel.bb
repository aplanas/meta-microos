SUMMARY = "Development files for libwrc, a Windows Resouce Compiler format support library"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libwrc."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libwrc-devel-20230318-1.5.aarch64.rpm"
RPM_HASH = "89f56ebb84cb53b405f5a14ead715ad919c345149e1c25b25e21b7d5538bf1fc2abe0a5a214b9f39e252c3c47db157028dc7bb2f4930b5a7e93377494eb088bd"

RPROVIDES:${PN} += "libwrc-devel \
pkgconfig-libwrc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libwrc1"

inherit rpm
