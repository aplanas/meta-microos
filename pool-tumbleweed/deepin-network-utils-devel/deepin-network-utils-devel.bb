SUMMARY = "Development tools for Deepin Network Utils"
DESCRIPTION = "The deepin-network-utils-devel package contains the header files for \
deepin-network-utils."
LICENSE = "GPL-3.0+"

PV = "5.4.13"

RPM_NAME = "deepin-network-utils-devel-5.4.13-1.8.aarch64.rpm"
RPM_HASH = "4ec5d997486b1aae7389634310a1ed7fa0689b54501c679e7dd98ad069252962dacf49c7e1ba189475c818dee7ff742552f5167d183695cef3c7fca1a18c13bd"

RPROVIDES:${PN} += "deepin-network-utils-devel \
pkgconfig-dde-network-utils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdde-network-utils1"

inherit rpm
