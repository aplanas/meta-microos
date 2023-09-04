SUMMARY = "Development files for the Adwaita library"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the development files for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.4"

RPM_NAME = "libadwaita-devel-1.3.4-1.1.aarch64.rpm"
RPM_HASH = "a45785714afb4c8fcd5352f67ac8e765729b113baa5d3f48cfe477e6f7a517861ca28f524316186c7edd311a30ab0d3aeea26468eed346ff88800e85168a4860"

RPROVIDES:${PN} += "libadwaita-devel \
pkgconfig-libadwaita-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libadwaita-1-0 \
pkgconfig-fribidi \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk4 \
typelib-1-0-Adw-1"

inherit rpm
