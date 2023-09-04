SUMMARY = "Header files and libraries for developing applications for libfvde"
DESCRIPTION = "Header files and libraries for developing applications for libfvde \
 \
See libfvde for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libfvde."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde-devel-20220915-4.1.aarch64.rpm"
RPM_HASH = "b26ac207018c22dc75414991a2f15d24b82f0bbb8fb31f07b41bef424a60b26233f33a0b20d76056541c4a88fc9991e6cf2208b66dabb76598429db887e7b7fa"

RPROVIDES:${PN} += "libfvde-devel \
pkgconfig-libfvde"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfvde1"

inherit rpm
