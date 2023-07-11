SUMMARY = "Development tools for ibus"
DESCRIPTION = "The ibus-devel package contains the header files and developer \
docs for ibus."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-devel-1.5.28-2.2.aarch64.rpm"
RPM_HASH = "3b05d9c99ef015fbdd1832ae3d19c7cc80d56e2e3aefa3b895dc188aff1685a4fa3953bb10e7ab21316e3728dc087450286325f8af89c541a5584f13a91ed1f8"

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
