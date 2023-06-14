SUMMARY = "Development files for Ayatana Indicator Display Objects"
DESCRIPTION = "Shared library providing extra GTK menu items for display in \
system indicators. \
 \
This package contains the development files for Ido."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "0.9.2"

RPM_NAME = "ayatana-ido-devel-0.9.2-1.4.aarch64.rpm"
RPM_HASH = "ae3c2745b4659b0985a1cf51d54c995912052cf86120488b061cdd25a83b49028e4608a923dce0b70d834eb6d1dfbecf21b1cb67fcfe4e330c9fb1dbe0cc7b01"

RPROVIDES:${PN} += "ayatana-ido-devel \
pkgconfig-libayatana-ido3-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libayatana-ido3-0-4-0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-introspection-1.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-AyatanaIdo3-0-4"

inherit rpm
