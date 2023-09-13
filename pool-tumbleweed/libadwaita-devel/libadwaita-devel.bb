SUMMARY = "Development files for the Adwaita library"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the development files for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.5"

RPM_NAME = "libadwaita-devel-1.3.5-1.1.aarch64.rpm"
RPM_HASH = "9db883aa65ebaaef44293b0c631018b12c862426138657a910fd40b077ca6dbcf1454f6d055dc75a8eeacd38bedbf1337109546c03a63d07c106065a7394ea85"

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
