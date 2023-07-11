SUMMARY = "Development files for the GTK+ Clutter integration"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GTK+ enables the use of GTK+ with Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.4"

RPM_NAME = "clutter-gtk-devel-1.8.4-5.18.aarch64.rpm"
RPM_HASH = "96e0abb03a03335b5a834a85aba7cdb394877fad7bbd6da5bc39ebc57522964957e9186e8e69404df7171e50246263f5ff8053be0a9da337e2c5865612c58933"

RPROVIDES:${PN} += "clutter-gtk-devel \
clutter-gtk-doc \
pkgconfig-clutter-gtk-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclutter-gtk-1-0-0 \
pkgconfig-clutter-1.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-GtkClutter-1-0"

inherit rpm
