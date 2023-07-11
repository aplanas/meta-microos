SUMMARY = "Development files for the Newt windowing toolkit"
DESCRIPTION = "This package contains the header files and libraries necessary for \
developing applications which use newt. \
 \
Newt is a development library for text mode user interfaces. \
 \
Install newt-devel if you want to develop applications which depend on \
newt."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.23"

RPM_NAME = "newt-devel-0.52.23-2.2.aarch64.rpm"
RPM_HASH = "fb6aec52f6ee350984d8e72f4d1a098483615a00d703866ac18c1f67b45ac3b6466aabb6150021663a38d8e8e2aa91a64919f22a9f689cce3a02c0792cb9793e"

RPROVIDES:${PN} += "newt-devel \
pkgconfig-libnewt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnewt0-52 \
pkgconfig-slang \
popt-devel \
python3-devel \
slang-devel"

inherit rpm
