SUMMARY = "Header files and libraries for developing applications for libfvde"
DESCRIPTION = "Header files and libraries for developing applications for libfvde \
 \
See libfvde for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libfvde."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde-devel-20220915-3.15.aarch64.rpm"
RPM_HASH = "8578b4fd102acd1da5333a9ca7d4a77c9086c6d12aa20bd0ce0180a457e46883ef82b972bbdcd00bb08554075ad3444bf06583bdc698dc4bce7348e746db602d"

RPROVIDES:${PN} += "libfvde-devel \
pkgconfig-libfvde"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfvde1"

inherit rpm
