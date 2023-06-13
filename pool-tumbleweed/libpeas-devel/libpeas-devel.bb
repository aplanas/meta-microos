SUMMARY = "Development files for libpeas, a GObject-based plugin engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "libpeas-devel-1.36.0-1.1.aarch64.rpm"
RPM_HASH = "3b729b274403675ef2145c39ca7705e9066c5c8732bbcb816c0b8d3c38d6d44b3c7de40a4bae9e169b8614060151ae42ea2bc743fc3dd791785db666115877a0"

RPROVIDES:${PN} += "libpeas-devel \
libpeas-devel(aarch-64) \
pkgconfig(libpeas-1.0) \
pkgconfig(libpeas-gtk-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpeas-1_0-0 \
libpeas-gtk-1_0-0 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gobject-introspection-1.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(libpeas-1.0) \
typelib-1_0-Peas-1_0 \
typelib-1_0-PeasGtk-1_0"

inherit rpm
