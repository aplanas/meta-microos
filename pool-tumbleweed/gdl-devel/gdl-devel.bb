SUMMARY = "Development files for the Gnome Devtool libraries"
DESCRIPTION = "Gnome Devtool Libraries contains components and libraries that are \
intended to be shared between GNOME development tools, including \
gnome-debug, gnome-build, and anjuta2."
LICENSE = "LGPL-2.1-or-later"

PV = "3.40.0"

RPM_NAME = "gdl-devel-3.40.0-2.9.aarch64.rpm"
RPM_HASH = "d5230e1674751776d7e9568815b62a50294192c4d17945b1070ac2e5f19ef02856512be6a25713f232e878d9776ee8c732df69a06232f4a85dad7015c50d4497"

RPROVIDES:${PN} += "gdl-devel \
pkgconfig-gdl-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgdl-3-5 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-Gdl-3"

inherit rpm
