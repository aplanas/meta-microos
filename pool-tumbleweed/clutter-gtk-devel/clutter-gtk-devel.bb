SUMMARY = "Development files for the GTK+ Clutter integration"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GTK+ enables the use of GTK+ with Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.4"

RPM_NAME = "clutter-gtk-devel-1.8.4-5.17.aarch64.rpm"
RPM_HASH = "0b68ebfdeeaa205b994483880137df6eef7ea3b20acbc8b2d576feba3a04f30fa96891151b040eedb0fd191f93ab2b0ccef5fbddddfe4612c212398e8bdace67"

RPROVIDES:${PN} += "clutter-gtk-devel \
clutter-gtk-devel(aarch-64) \
clutter-gtk-doc \
pkgconfig(clutter-gtk-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclutter-gtk-1_0-0 \
pkgconfig(clutter-1.0) \
pkgconfig(gtk+-3.0) \
typelib-1_0-GtkClutter-1_0"

inherit rpm
