SUMMARY = "Development tools for ibus"
DESCRIPTION = "The ibus-devel package contains the header files and developer \
docs for ibus."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-devel-1.5.28-2.1.aarch64.rpm"
RPM_HASH = "2df8293573fe0ac64186819c88a86de2c8e28431701cb987a5d3309c86a463b98d0035b2e5660077f1e51a532799fd84b4aec5ee9fb054bf79acd37b651ff14b"

RPROVIDES:${PN} += "ibus-devel \
pkgconfig-ibus-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-devel \
glib2-devel \
gtk-doc \
ibus \
libibus-1-0-5 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-IBus-1-0"

inherit rpm
