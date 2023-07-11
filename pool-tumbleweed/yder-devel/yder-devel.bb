SUMMARY = "Header files for yder"
DESCRIPTION = "Development and header files for yder."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.19"

RPM_NAME = "yder-devel-1.4.19-1.4.aarch64.rpm"
RPM_HASH = "f7595bb013a750bc4c55a905a33221d5740b2557f7c1a67741b3b18ad36732bc98fdb23ddfc8c638d55753dd9ec07cff0ec42fe6b14746db94aabd3df7de7f65"

RPROVIDES:${PN} += "cmake-Yder \
pkgconfig-libyder \
yder-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyder1-4 \
pkgconfig-liborcania \
pkgconfig-libsystemd"

inherit rpm
