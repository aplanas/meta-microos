SUMMARY = "Development files for the Gnome Devtool libraries"
DESCRIPTION = "Gnome Devtool Libraries contains components and libraries that are \
intended to be shared between GNOME development tools, including \
gnome-debug, gnome-build, and anjuta2."
LICENSE = "LGPL-2.1-or-later"

PV = "3.40.0"

RPM_NAME = "gdl-devel-3.40.0-2.10.aarch64.rpm"
RPM_HASH = "3f5320851df352115056209d0e76f6fc832615eecdc051aea69ec0893d500055d5144d06fa5572ae22e8aec6024d0720526b1fd013a1f1a0e48e7932b2a68d12"

RPROVIDES:${PN} += "gdl-devel \
pkgconfig-gdl-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgdl-3-5 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-Gdl-3"

inherit rpm
