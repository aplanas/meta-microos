SUMMARY = "Files for Developing with libwps"
DESCRIPTION = "libwps is a library for importing the Microsoft Works word processor \
and spreadsheet file format. \
 \
This package contains the libwps development files."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.4.14"

RPM_NAME = "libwps-devel-0.4.14-1.1.aarch64.rpm"
RPM_HASH = "c594d2b3b7745edbb4cc66091c7e4bfbb5754526267a63fc876621f5609fe1ac36560f932cb49431c0f32eb44261506d1e9e5e802e48af0c493e377de8bb2605"

RPROVIDES:${PN} += "libwps-devel \
pkgconfig-libwps-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwps-0-4-4 \
pkgconfig-librevenge-0.0"

inherit rpm
