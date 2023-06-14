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

RPM_NAME = "newt-devel-0.52.23-2.1.aarch64.rpm"
RPM_HASH = "9acdaf568d28cade415d3d492687b6e792d28d55bab8bd6b785babdf7f9a0d79e09251580b2e48e2f16d333b5766fe618f2392abb2cddb8fda0f313fa6788745"

RPROVIDES:${PN} += "newt-devel \
pkgconfig-libnewt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnewt0-52 \
pkgconfig-slang \
popt-devel \
python3-devel \
slang-devel"

inherit rpm
