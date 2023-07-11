SUMMARY = "Header files for the Cairo C++ interface"
DESCRIPTION = "This package contains the header files for developing \
applications that want to make use of cairomm."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.1"

RPM_NAME = "cairomm-devel-1.16.1-2.4.aarch64.rpm"
RPM_HASH = "d159d3126af435dbc1be4c4f7939292f458ca88b80641a495e4cb2002e544e31667f9af6fbff476058680e8b1036bea9a933dd439c684fb884e5b97ac3b630ea"

RPROVIDES:${PN} += "cairomm-devel \
pkgconfig-cairomm-1.16 \
pkgconfig-cairomm-ft-1.16 \
pkgconfig-cairomm-pdf-1.16 \
pkgconfig-cairomm-png-1.16 \
pkgconfig-cairomm-ps-1.16 \
pkgconfig-cairomm-svg-1.16 \
pkgconfig-cairomm-xlib-1.16 \
pkgconfig-cairomm-xlib-xrender-1.16"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcairomm-1-16-1 \
pkgconfig-cairo \
pkgconfig-cairo-ft \
pkgconfig-cairo-pdf \
pkgconfig-cairo-png \
pkgconfig-cairo-ps \
pkgconfig-cairo-svg \
pkgconfig-cairo-xlib \
pkgconfig-cairo-xlib-xrender \
pkgconfig-cairomm-1.16 \
pkgconfig-sigc++-3.0"

inherit rpm
