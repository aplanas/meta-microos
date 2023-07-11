SUMMARY = "Remote Desktop Toolkit libuwac development files"
DESCRIPTION = "This package contains header files for developing applications that \
use the uwac library."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "uwac0-0-devel-2.10.0-3.2.aarch64.rpm"
RPM_HASH = "6f47c76fb480155e2711d6b4994c1de5156c5f3f1a619ad28f84f520cbb39c6730ec1b50c0e24baee6c6f20e13604cc27a3e288d61d6b30120449f95d67aa197"

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
