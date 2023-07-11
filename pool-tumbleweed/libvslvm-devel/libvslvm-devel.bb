SUMMARY = "Header files and libraries for developing applications for libvslvm"
DESCRIPTION = "Header files and libraries for developing applications for libvslvm \
 \
See libvslvm for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libvslvm."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libvslvm-devel-20221025-3.9.aarch64.rpm"
RPM_HASH = "ee54e9b7bd9da25e9be9ffe577180bc085eb76a9113c267c1b857027f44e43f16ede5ae68d491fd570b9e6523a1afc298286c8bf85cf085d7ba2cc9b0ec9af53"

RPROVIDES:${PN} += "libvslvm-devel \
pkgconfig-libvslvm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvslvm1"

inherit rpm
