SUMMARY = "Header files and libraries for developing applications for libfvde"
DESCRIPTION = "Header files and libraries for developing applications for libfvde \
 \
See libfvde for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libfvde."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde-devel-20220915-3.14.aarch64.rpm"
RPM_HASH = "9495b0c946681cc02a5c4c8874958c21a2f0180deb99b0e630db806db938f82df0d61c025af96c7572133b962c0797fbd93e4c548d9a3d8d02936ddcfc6dc276"

RPROVIDES:${PN} += "libfvde-devel \
pkgconfig-libfvde"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfvde1"

inherit rpm
