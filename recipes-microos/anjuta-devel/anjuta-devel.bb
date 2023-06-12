SUMMARY = "Development files for Anjuta plugins"
DESCRIPTION = "Anjuta is a versatile Integrated Development Environment (IDE) for the \
GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "anjuta-devel-3.34.0-5.7.aarch64.rpm"
RPM_HASH = "a3cacad940f540176473ac2d2480e5e250e9b6846639c2586df82613998670baa0e549de6d4630a5e1c515a68bb7caa6a413203791c95115a32269202e6036cb"

RPROVIDES:${PN} += "anjuta-devel \
anjuta-devel(aarch-64) \
anjuta-doc \
pkgconfig(libanjuta-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libanjuta-3-0 \
pkgconfig(gdl-3.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(libxml-2.0) \
typelib-1_0-Anjuta-3_0"

inherit rpm
