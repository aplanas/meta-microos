SUMMARY = "Header files and libraries for developing applications for libvslvm"
DESCRIPTION = "Header files and libraries for developing applications for libvslvm \
 \
See libvslvm for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libvslvm."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libvslvm-devel-20221025-3.7.aarch64.rpm"
RPM_HASH = "ba75a2ad1a0facebc3956bca0ba488f187d3f3b05c6bfa49bb5805b675c9ad911d459215004ea0fa4aa897b1cdabc77167f33202c1fd29a56f4ecc2d71444252"

RPROVIDES:${PN} += "libvslvm-devel \
libvslvm-devel(aarch-64) \
pkgconfig(libvslvm)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvslvm1"

inherit rpm
