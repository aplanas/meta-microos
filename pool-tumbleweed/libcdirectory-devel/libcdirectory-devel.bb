SUMMARY = "Development files for libcdirectory"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries.  libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcdirectory."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220105"

RPM_NAME = "libcdirectory-devel-20220105-2.7.aarch64.rpm"
RPM_HASH = "a55a31d225c2357d34349f3c46b0bc161568294358721b4116ecb1ac33f5e9b6b6e35c99ea161e1833d1fdf9499100f069d474a23264d2270bb90218ce458a49"

RPROVIDES:${PN} += "libcdirectory-devel \
pkgconfig-libcdirectory"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcdirectory1"

inherit rpm
