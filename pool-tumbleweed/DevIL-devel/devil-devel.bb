SUMMARY = "Header files for Developers Image Library"
DESCRIPTION = "Developer's Image Library (DevIL) is a programmer's library to develop \
applications with image loading capabilities. \
 \
This package contains the development libraries and headers."
LICENSE = "LGPL-2.1-only"

PV = "1.7.8"

RPM_NAME = "DevIL-devel-1.7.8-11.11.aarch64.rpm"
RPM_HASH = "27a377383bada6d32be1f5dbee7a3eea0bdb250b7e6e1f605f02f5dae0966bb1f74966fa7837ae7674af2cdfef56c2a6bfd6fe67046b9a9f12307a3626b1d416"

RPROVIDES:${PN} += "DevIL-devel \
DevIL-devel(aarch-64) \
libdevil-devel \
pkgconfig(IL) \
pkgconfig(ILU) \
pkgconfig(ILUT)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libIL1 \
pkgconfig(IL)"

inherit rpm
