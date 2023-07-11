SUMMARY = "Header files for the Cairo C++ interface"
DESCRIPTION = "This package contains the header files for developing \
applications that want to make use of cairomm1_0."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "cairomm1_0-devel-1.12.2-4.4.aarch64.rpm"
RPM_HASH = "0cbac3e3ccd72d24903ab9499f7566fc01cde2ee85a9f0ab09f01a865ae5506b938b351f89511175055ab48af2a68e528462e2fe96461f350b5689d97c8aba9c"

RPROVIDES:${PN} += "cairomm1-0-devel \
pkgconfig-cairomm-1.0 \
pkgconfig-cairomm-ft-1.0 \
pkgconfig-cairomm-pdf-1.0 \
pkgconfig-cairomm-png-1.0 \
pkgconfig-cairomm-ps-1.0 \
pkgconfig-cairomm-svg-1.0 \
pkgconfig-cairomm-xlib-1.0 \
pkgconfig-cairomm-xlib-xrender-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcairomm-1-0-1 \
pkgconfig-cairo \
pkgconfig-cairo-ft \
pkgconfig-cairo-pdf \
pkgconfig-cairo-png \
pkgconfig-cairo-ps \
pkgconfig-cairo-svg \
pkgconfig-cairo-xlib \
pkgconfig-cairo-xlib-xrender \
pkgconfig-cairomm-1.0 \
pkgconfig-sigc++-2.0"

inherit rpm
