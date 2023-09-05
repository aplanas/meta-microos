SUMMARY = "Remote Desktop Toolkit libuwac development files"
DESCRIPTION = "This package contains header files for developing applications that \
use the uwac library."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "uwac0-0-devel-2.11.0-1.1.aarch64.rpm"
RPM_HASH = "d8ca1e2fe745f4bc0523f4874727a237ea21bf895fd55fa43c03050928f5c210a92aa74b64cbe3b6e0894ab17655bccf1d9eb20e00835c2ddb3a3c8ee5b1c4c9"

RPROVIDES:${PN} += "cmake-uwac \
libuwac0-devel \
pkgconfig-uwac0 \
uwac0-0-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libuwac0-0 \
pkgconfig-freerdp2 \
pkgconfig-wayland-client \
pkgconfig-xkbcommon"

inherit rpm
