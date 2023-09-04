SUMMARY = "Header files for the user account information manipulation service"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "accountsservice-devel-23.13.9-4.1.aarch64.rpm"
RPM_HASH = "5acfe0ba25d29811ddf7d51dd5449eb030d8646102d8acaa18749cc84d26be709fe02872bf198c9c5bb6f96904d74c57c93d2c8b3e3d391a6c9e3644dcda1849"

RPROVIDES:${PN} += "accountsservice-devel \
pkgconfig-accountsservice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaccountsservice0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-polkit-gobject-1 \
typelib-1-0-AccountsService-1-0"

inherit rpm
